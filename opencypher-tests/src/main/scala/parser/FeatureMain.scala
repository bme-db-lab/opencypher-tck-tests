package parser

import ingraph.cucumber.featureresult.parser.FeatureParser

object FeatureMain {

  def main(args: Array[String]): Unit = {
    val s1 = "<({weight: 3})-[:REL {something: 'ab'}]->(:Label2:Label3 {name: 'hello'})>"
    val s2 = "2"
    
    compileValue(s1)
  }
  
  def compileValue(featureString : String) {
    val value = FeatureParser.parseString(featureString)
    val compiler = new Compiler
    compiler.compile(value)
  }

}
