package calculator

import org.neo4j.driver.v1.{Record, Session}

import collection.JavaConverters._
import scala.collection.mutable

/**
  * Created by Andras Zsamboki on 2017.04.18..
  */
class SideEffectsHolder(val session: Session) {
  var sideEffectsMap = new mutable.HashMap[String, mutable.Buffer[Record]]()
  var sideEffectsQueryMap = new mutable.HashMap[String, (String)]()

  def init() = {
    if (!isAlreadyInited()) {
      sideEffectsQueryMap += "nodes" -> "MATCH (n) RETURN n"
      sideEffectsQueryMap += "relationships" -> "MATCH ()-[r]-() RETURN DISTINCT r"
      sideEffectsQueryMap += "labels" -> "MATCH (n) UNWIND labels(n) AS label RETURN DISTINCT label"
      sideEffectsQueryMap += "properties" -> "MATCH (n) UNWIND keys(n) AS key RETURN key"
      session.beginTransaction()
      sideEffectsQueryMap.foreach(x => sideEffectsMap += (x._1 -> session.run(x._2).list().asScala))

    }
  }

  def isAlreadyInited(): Boolean = sideEffectsMap.nonEmpty

  def calculateDifference(): mutable.Map[String, Int] = {
    var newSideEffectsMap = new mutable.HashMap[String, mutable.Buffer[Record]]()
    var positiveEffectsMap = new mutable.HashMap[String, Int]()
    var negativeEffectsMap = new mutable.HashMap[String, Int]()
    session.beginTransaction()
    sideEffectsQueryMap.foreach(x => newSideEffectsMap += (x._1 -> session.run(x._2).list().asScala))
    newSideEffectsMap.foreach(x => {
      newSideEffectsMap(x._1).diff(sideEffectsMap(x._1)).size match {
        case y if y != 0 => positiveEffectsMap += ("+" + x._1 -> y)
        case _ =>
      }
    }
    )
    sideEffectsMap.foreach(x => {
      sideEffectsMap(x._1).diff(newSideEffectsMap(x._1)).size match {
        case y if y != 0 => negativeEffectsMap += ("-" + x._1 -> y)
        case _ =>
      }
    })
    positiveEffectsMap ++ negativeEffectsMap
  }
}
