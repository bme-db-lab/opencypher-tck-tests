package validators

/**
  * Created by Andras Zsamboki on 2017.02.18..
  */
abstract class BaseValidator {
  def isValid(equation: String): Boolean
}
