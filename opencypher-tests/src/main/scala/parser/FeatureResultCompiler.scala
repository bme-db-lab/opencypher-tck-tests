package parser

import ingraph.cucumber.featureresult.featureResults.{NodeDesc, RelationshipDesc, Value}
import ingraph.cucumber.featureresult.featureResults.Node
import ingraph.cucumber.featureresult.featureResults.Relationship
import ingraph.cucumber.featureresult.featureResults.PathBody

import util.EmfConversions._
import ingraph.cucumber.featureresult.featureResults.DirectedRelationship
import org.eclipse.emf.ecore.EObject
import ingraph.cucumber.featureresult.featureResults.Integer
import ingraph.cucumber.featureresult.featureResults.PropertyMap
import ingraph.cucumber.featureresult.featureResults.PropertyValue
import ingraph.cucumber.featureresult.featureResults.MyString

class Compiler {

  def compile(v: Any): Unit = {
    v match {
      case x: PathBody => c(x)
      case x: NodeDesc => c(x)
      case x: RelationshipDesc => c(x)
      case x: Integer => c(x)
      case x: PropertyMap => c(x)
      case x: MyString => c(x)
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
    compile(node.getPropertyMap)
  }

  def c(relationship: RelationshipDesc): Unit = {
    println(s"relationship $relationship")
    println(relationship.getType)
    compile(relationship.getPropertyMap)
  }
  
  def c(propertyMap: PropertyMap): Unit = {
    print("propertyMap with values: ")
    println( 
        propertyMap.getMapContents.getKeyValuePairs.map { x => x.getKey + "=" + compile(x.getValue) }.toVector.mkString(", ")
    )
//    compile()
  }
  
  def c(myString: MyString): Unit = {
    println(">" + myString.getValue)
  }

}
