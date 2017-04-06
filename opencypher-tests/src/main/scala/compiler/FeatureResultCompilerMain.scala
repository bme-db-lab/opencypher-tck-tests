package compiler

import neo4j.driver.testkit.EmbeddedTestkitDriver
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.v1.{Record, StatementResult, Value}

import scala.collection.JavaConverters._
import scala.collection.mutable
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
    val expectedResultString = "(:L)"
    var expectedResultValue = FeatureResultCompiler.parseAndCompile(expectedResultString)
    var driver = new EmbeddedTestkitDriver
    driver.session.run("CREATE (a:L), (b1), (b2)\n      CREATE (a)-[:A]->(b1), (a)-[:A]->(b2)")
    driver.session.beginTransaction
    var actualResultBuffer = driver.session.run("MATCH p=(a:L)-[*]->(b)\n      RETURN b, avg(length(p))").list.asScala
    resultEqualityCheck(expectedResultValue, actualResultBuffer )
  }


  def resultEqualityCheck(expectedResult: Value, actualStatementResultBuffer: mutable.Buffer[Record] ): Unit ={
   //TODO how to check if i already found an element before
    /*
    properties --> asEntity.asMap
    labels
     */
    println(expectedResult)
    expectedResult match{
      case nodeValue:NodeValue => {
          println(nodeValue.asEntity.labels().iterator().next())
      }
    }
    println(actualStatementResultBuffer)
  }
}
