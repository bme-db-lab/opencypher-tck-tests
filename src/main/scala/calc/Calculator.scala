package calc

/**
  * Created by Andras Zsamboki on 2017.02.18..
  */
class Calculator(var value: Int = 0) {
  def calculate(equation: List[String]): Int = equation match {
    case l :: "+" :: r :: rest => calculate((l.toInt + r.toInt).toString :: rest)
    case l :: "-" :: r :: rest => calculate((l.toInt - r.toInt).toString :: rest)
    case "" :: value :: rest => calculate((value).toString :: rest)
    case value :: Nil => value.toInt
  }

  def isEqual(equation: String): Boolean = calculate(equation.split("=")(0).split("\\s").toList) == calculate(equation.split("=")(1).split("\\s").toList)
}
