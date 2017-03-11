package parser

import ingraph.cucumber.featureresult.featureResults.{NodeDesc, RelationshipDesc, Value}
import ingraph.cucumber.featureresult.featureResults.Node
import ingraph.cucumber.featureresult.featureResults.Relationship
import ingraph.cucumber.featureresult.featureResults.PathBody

import util.EmfConversions._
import ingraph.cucumber.featureresult.featureResults.DirectedRelationship
import org.eclipse.emf.ecore.EObject
import ingraph.cucumber.featureresult.featureResults.Integer

class Compiler {

  def compile(v: Any): Unit = {
    v match {
      case x: PathBody => c(x)
      case x: NodeDesc => c(x)
      case x: RelationshipDesc => c(x)
      case x: Integer => c(x)
    }
  }

  def c(integer: Integer) = {
    println(integer.getValue)
  }

  def c(pathBody: PathBody) = {
    compile(pathBody.getNode)
    
    for (pathLink <- pathBody.getPathLinks) {
      compile(pathLink.getRelationship.getRelationshipDesc)
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
