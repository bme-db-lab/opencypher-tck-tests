package parser

import ingraph.cucumber.featureresult.parser.FeatureParser

object FeatureMain {

  def main(args: Array[String]): Unit = {
    val s1 = "<({weight: 3})-[:REL {something: 'ab'}]->(:Label2:Label3 {name: 'hello'})>"
    val s2 = "2"
    val s3 = "[(:Label2:Label3 {name: 'hello'})]"
    val s4 = "['a', ['b']]"
    val s5 = "(:LABEL {attr: ['a', ['b']]})"
    val s6 = "<()-[:R1]->()>"
    
    println(FeatureResultCompiler.parseAndCompile(s1).getClass())
    println(FeatureResultCompiler.parseAndCompile(s2).getClass())
    println(FeatureResultCompiler.parseAndCompile(s3).getClass())
    println(FeatureResultCompiler.parseAndCompile(s4).getClass())
    println(FeatureResultCompiler.parseAndCompile(s5).getClass())
    println(FeatureResultCompiler.parseAndCompile(s6).getClass())
  }
  
}
