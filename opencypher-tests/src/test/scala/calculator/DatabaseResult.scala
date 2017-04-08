package calculator

import scala.collection.mutable.ListBuffer

/**
  * Created by Andras Zsamboki on 2017.03.02..
  */
case class DatabaseResult(var queryResult: ListBuffer[String], var sideEffect: scala.collection.mutable.Map[String, Int]) {

}
