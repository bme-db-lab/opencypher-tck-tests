package parser

import ingraph.cucumber.featureresult.parser.FeatureParser

object FeatureMain {

  def main(args: Array[String]): Unit = {
    val value = FeatureParser.parseString("(:Label {name: 'hello'})")
    println(value)
  }

}
