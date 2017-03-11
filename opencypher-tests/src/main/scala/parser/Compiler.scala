package parser

import ingraph.cucumber.featureresult.featureResults.{NodeDesc, RelationshipDesc, Value}
import ingraph.cucumber.featureresult.featureResults.Node
import ingraph.cucumber.featureresult.featureResults.Relationship
import ingraph.cucumber.featureresult.featureResults.PathBody

import Conversions._

class Compiler {

  def compile(value: Value): Unit = {
    value match {
      case x: PathBody => c(x)
      case x: NodeDesc => c(x)
      case x: RelationshipDesc => c(x)
    }
  }

  def c(pathBody: PathBody) = {
    compile(pathBody.getNode)
    
    for (pathLink <- pathBody.getPathLinks) {
//      compile(pathLink.getRelationship)
      compile(pathLink.getNode)
    }
  }
  
  def c(node: NodeDesc): Unit = {
    println(s"node $node")
    println(node.getLabels)
  }

  def c(relationship: RelationshipDesc): Unit = {
    println(s"relationship $relationship")
    println(relationship.getType)
  }

}
