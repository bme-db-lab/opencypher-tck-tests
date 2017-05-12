package compiler

import neo4j.driver.testkit.EmbeddedTestkitDriver
import org.neo4j.driver.internal.value.{ListValue, NodeValue, StringValue}
import org.neo4j.driver.v1.{Record, StatementResult, Value}

import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object FeatureResultCompilerMain {

  def main(args: Array[String]): Unit = {
    /*val s1 = "<({weight: 3})-[:REL {something: 'ab'}]->(:Label2:Label3 {name: 'hello'})>"*/
    val s2 = "2"
    /* val s3 = "[(:Label2:Label3 {name: 'hello'})]"
     val s4 = "['a', ['b']]"
     val s5 = "(:LABEL {attr: ['a', ['b']]})"
     val s6 = "<()-[:R1]->()>"*/

    /* println(FeatureResultCompiler.parseAndCompile(s1).getClass())
     println(FeatureResultCompiler.parseAndCompile(s2).getClass())
     println(FeatureResultCompiler.parseAndCompile(s3).getClass())
     println(FeatureResultCompiler.parseAndCompile(s4).getClass())
     println(FeatureResultCompiler.parseAndCompile(s5).getClass())*/
    println(FeatureResultCompiler.parseAndCompile(s2).getClass())
    val expectedResultString = "r"
    val expectedResultValue = FeatureResultCompiler.parseAndCompile(expectedResultString)
    val driver = new EmbeddedTestkitDriver
    driver.session.run("    UNWIND range(0, 1000) AS i\n      CREATE (:A {id: i})\n      MERGE (:B {id: i % 10})\n ")
    driver.session.beginTransaction
    val actualStatementResultBuffer = driver.session.run("MATCH (a:A), (b:B)\n      WHERE a.id = b.id\n      RETURN a, b").list.asScala
    resultEqualityCheck(expectedResultValue, actualStatementResultBuffer)
  }


  def resultEqualityCheck(expectedResult: Value, actualStatementResultBuffer: mutable.Buffer[Record]): Unit = {
    val expectedResultStringBuffer = ListBuffer[String]()
    resultToStringBuffer(expectedResult, expectedResultStringBuffer)
    println(actualStatementResultBuffer)
  }

  def resultToStringBuffer(resultElement: Value, resultStringBuffer: ListBuffer[String]): Unit = {
    resultElement match {
      case stringValue: StringValue =>
        resultStringBuffer += stringValue.asString()

      case nodeValue: NodeValue =>
        resultStringBuffer ++= nodeValue.asEntity().labels().asScala
        resultStringBuffer ++= nodeValue.asEntity().asMap.asScala.toList.map(x => x._1 + " : " + x._2)

      case listValue: ListValue =>
        listValue.values().asScala.foreach(x => resultToStringBuffer(x, resultStringBuffer))

    }
  }
}
