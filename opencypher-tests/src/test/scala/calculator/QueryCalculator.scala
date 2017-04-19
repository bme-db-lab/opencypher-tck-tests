package calculator

import compiler.FeatureResultCompiler
import cucumber.api.DataTable
import org.neo4j.driver.internal.value._
import org.neo4j.driver.v1.{Session, Value}

import scala.collection.mutable.ListBuffer
import collection.JavaConverters._

/**
  * Created by Andras Zsamboki on 2017.03.01..
  */
object QueryCalculator {


  def calculateSideEffects(session: Session, query: String): DatabaseResult = {
    lazy val sideEffectsHolder =  new SideEffectsHolder(session)
    sideEffectsHolder.init()
    lazy val queryResultsBuffer = ListBuffer[String]()
    session.beginTransaction()
    val sessionResult = session.run(query)
    val unProcessedQueryResultsBuffer = sessionResult.list().asScala
    if (unProcessedQueryResultsBuffer.nonEmpty) {
      unProcessedQueryResultsBuffer.head.keys().asScala.foreach(x => queryResultsBuffer += x)
    }
    unProcessedQueryResultsBuffer.foreach(_.values().asScala.foreach(value => resultElementToStringBuffer(value, queryResultsBuffer)))

    DatabaseResult(queryResultsBuffer, sideEffectsHolder.calculateDifference())

  }

  def checkResultEqualiy(result: DatabaseResult, expectedDataTable: DataTable): Boolean = {
    val expectedResult = ListBuffer[String]()

    expectedDataTable.getGherkinRows.asScala.zipWithIndex foreach { case (el, i) =>
      if (i == 0) {
        expectedResult ++= el.getCells.asScala
      } else {
        el.getCells.asScala.foreach(x => resultElementToStringBuffer(FeatureResultCompiler.parseAndCompile(x), expectedResult))
      }
    }
    println("EXPECTED RESULT: ")
    expectedResult.foreach(println)
    println("QUERY RESULT: ")
    result.queryResult.foreach(println)
    //TODO megnezni, hogy miert igy kapom vissza a String-et : 'STRING'
    expectedResult.map(_.replace("'", "")).intersect(result.queryResult).size == expectedResult.size
  }


  def checkSideEffectsEquality(result: DatabaseResult, expectedResult: Option[DataTable]): Boolean = {
    val expectedResultMap = collection.mutable.Map[String, Int]()
    println("result: ")
    result.sideEffect.foreach(println)
    expectedResult match {
      case Some(x) =>
        x.raw().asScala.foreach(x =>
          expectedResultMap += (x.get(0) -> x.get(1).toInt)
        )
        println("expected result: ")
        expectedResultMap.foreach(println)
        result.sideEffect == expectedResultMap
      case None => result.sideEffect.isEmpty
    }
  }

  def resultElementToStringBuffer(resultElement: Value, resultStringBuffer: ListBuffer[String]): Unit = {
    resultElement match {
      case relationShipValue: RelationshipValue =>
        resultStringBuffer += relationShipValue.asRelationship().`type`()
      //TODO relationship propertyk listázása resultStringBuffer += relationShipValue.asRelationship().asMap.asScala.toList(x => x._1 + " : " + x._2)

      case booleanValue: BooleanValue =>
        resultStringBuffer += booleanValue.toString

      case _: NullValue =>
        resultStringBuffer += "null"

      case null =>
        resultStringBuffer += "null"

      case mapValue: MapValue =>
        resultStringBuffer += mapValue.asMap.toString

      case integerValue: IntegerValue =>
        resultStringBuffer += integerValue.toString

      case stringValue: StringValue =>
        resultStringBuffer += stringValue.asString

      case floatValue: FloatValue =>
        resultStringBuffer += floatValue.toString

      case nodeValue: NodeValue =>
        resultStringBuffer ++= nodeValue.asEntity().labels().asScala
        resultStringBuffer ++= nodeValue.asEntity().asMap.asScala.toList.map(x => x._1 + " : " + x._2)

      case listValue: ListValue =>
        listValue.values().asScala.foreach(x => resultElementToStringBuffer(x, resultStringBuffer))

    }
  }

}
