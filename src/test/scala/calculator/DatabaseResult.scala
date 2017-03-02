package calculator

/**
  * Created by Andras Zsamboki on 2017.03.02..
  */
case class DatabaseResult(var queryResult: scala.collection.mutable.Map[String, Int], var sideEffect: scala.collection.mutable.Map[String, Int]) {

}
