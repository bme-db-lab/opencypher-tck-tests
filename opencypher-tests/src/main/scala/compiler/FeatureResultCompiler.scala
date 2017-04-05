package compiler

import scala.collection.JavaConverters._

import org.neo4j.driver.internal.InternalNode
import org.neo4j.driver.internal.value.BooleanValue
import org.neo4j.driver.internal.value.IntegerValue
import org.neo4j.driver.internal.value.StringValue

import ingraph.cucumber.featureresult.featureResults.Bool
import ingraph.cucumber.featureresult.featureResults.DirectedRelationship
import ingraph.cucumber.featureresult.featureResults.Integer
import ingraph.cucumber.featureresult.featureResults.List
import ingraph.cucumber.featureresult.featureResults.MyString
import ingraph.cucumber.featureresult.featureResults.NodeDesc
import ingraph.cucumber.featureresult.featureResults.NullValue
import ingraph.cucumber.featureresult.featureResults.PathBody
import ingraph.cucumber.featureresult.featureResults.PropertyMap
import ingraph.cucumber.featureresult.featureResults.PropertyValue
import ingraph.cucumber.featureresult.featureResults.RelationshipDesc
import util.EmfConversions._
import org.neo4j.driver.internal.value.ListValue
import org.neo4j.driver.v1.types.Node
import org.neo4j.driver.v1.types.Relationship
import org.neo4j.driver.internal.value.NodeValue
import org.neo4j.driver.internal.value.RelationshipValue
import org.neo4j.driver.internal.InternalRelationship
import ingraph.cucumber.featureresult.featureResults.FeatureValue
import org.neo4j.driver.v1.Value
import org.neo4j.driver.internal.value.MapValue
import org.neo4j.driver.v1.Values
import org.neo4j.driver.v1.types.Path
import org.neo4j.driver.internal.InternalPath
import org.neo4j.driver.internal.value.PathValue
import org.neo4j.driver.v1.types.Entity
import ingraph.cucumber.featureresult.parser.FeatureParser
import ingraph.cucumber.featureresult.featureResults.ForwardsRelationship
import ingraph.cucumber.featureresult.featureResults.BackwardsRelationship

object FeatureResultCompiler {

  def parseAndCompile(featureString: String): Value = {
    val value = FeatureParser.parseString(featureString)
    compile(value)
  }

  /**
   *   Node -> NodeDesc
   * | Relationship -> RelationshipDesc
   * | Path -> PathBody
   * | Integer
   * | FloatingPoint -> ???
   * | MyString
   * | Bool
   * | NullValue
   * | List
   * | Map -> PropertyMap
   *   ;
   */
  def compile(v: Any): Value = {
    v match {
      case x: NodeDesc => c(x)
      case x: RelationshipDesc => c(x)
      case x: PathBody => c(x)
      case x: Integer => c(x)
      case x: MyString => c(x)
      case x: Bool => c(x)
      case x: NullValue => c(x)
      case x: List => c(x)
      case x: PropertyMap => c(x)
    }
  }

  protected def c(node: NodeDesc): NodeValue = {
    val labels = node.getLabels.map { _.getName }.toList.asJava
    val propertiesMapValue = c(node.getPropertyMap)
    val properties = propertiesMapValue.asMap(Values.ofValue)
    new NodeValue(new InternalNode(0, labels, properties))
  }

  protected def c(relationship: RelationshipDesc): RelationshipValue = {
    val t = relationship.getType
    val propertiesMapValue = c(relationship.getPropertyMap)
    val properties = propertiesMapValue.asMap(Values.ofValue())
    new RelationshipValue(new InternalRelationship(0, 0, 0, t, properties))
  }

  protected def c(pathBody: PathBody): PathValue = {
    val alternatingNodeAndRel = scala.collection.mutable.MutableList[Entity]()
    val nodeValue = c(pathBody.getNode)

    alternatingNodeAndRel += nodeValue.asNode()

    for (pathLink <- pathBody.getPathLinks) {
      val relationship = c(pathLink.getRelationship.getRelationshipDesc)
      alternatingNodeAndRel += relationship.asRelationship()

      val node = c(pathLink.getNode)
      alternatingNodeAndRel += node.asNode()

      // TODO we should take the directionality into account
      pathLink.getRelationship match {
        case f: ForwardsRelationship =>
        case b: BackwardsRelationship =>
      }
    }

    new PathValue(new InternalPath(alternatingNodeAndRel.asJava))
  }

  protected def c(integer: Integer): IntegerValue = {
    new IntegerValue(integer.getValue)
  }

  protected def c(myString: MyString): StringValue = {
    new StringValue(myString.getValue)
  }

  protected def c(bool: Bool): BooleanValue = {
    if (bool.getValue == "true") BooleanValue.TRUE else BooleanValue.FALSE
  }

  protected def c(nullValue: NullValue) = null

  protected def c(list: List): ListValue = {
    val content: Array[Value] = list.getListContents.getListContents.map { x => compile(x) }.toArray
    new ListValue(content: _*)
  }

  protected def c(propertyMap: PropertyMap): MapValue = {
    // maps might be null for nodes/relationships without properties, e.g. (:Label)
    val map = if (propertyMap == null) {
      Map[String, Value]()
    } else {
      propertyMap.getMapContents.getKeyValuePairs.map { x => x.getKey -> compile(x.getValue) }.toMap
    }
    new MapValue(map.asJava)
  }

}
