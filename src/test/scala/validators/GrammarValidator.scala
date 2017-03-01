package validators

/**
  * Created by Andras Zsamboki on 2017.02.18..
  */
object GrammarValidator extends BaseValidator {
  override def isValid(equation: String): Boolean = equation.split("=").length == 2
}
