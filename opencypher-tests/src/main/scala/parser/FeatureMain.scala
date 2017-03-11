package parser

import ingraph.cucumber.featureresult.parser.FeatureParser

object FeatureMain {

  def main(args: Array[String]): Unit = {
    val s1 = "<({weight: 3})-[:REL {something: 'ab'}]->(:Label2:Label3 {name: 'hello'})>"
    val s2 = "2"
    val s3 = "[(:Label2:Label3 {name: 'hello'})]"
    val s4 = "['a', ['b']]"
    
    compileValue(s4)
  }
  
  def compileValue(featureString : String) {
    val value = FeatureParser.parseString(featureString)
    val compiler = new Compiler
    compiler.compile(value)
  }

}
