package calculator

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * Created by Andras Zsamboki on 2017.03.02..
  */
case class DatabaseResult(var queryResult: Option[ListBuffer[String]], var sideEffect: Option[mutable.Map[String, Int]], exception: Option[Exception]) {

}
