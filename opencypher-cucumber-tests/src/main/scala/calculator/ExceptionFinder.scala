package calculator

import org.neo4j.cypher.SyntaxException

/**
  * Created by Andras Zsamboki on 2017.06.19..
  */
object ExceptionFinder {

  def findException[T <: Throwable, U <: Throwable](exception: T, exceptionClassToFind: Class[U]): Boolean = {
    if (exception.getCause == null) {
      false
    }
    else if (exception.getClass.isAssignableFrom(exceptionClassToFind)) {
      true
    }
    else findException(exception.getCause, exceptionClassToFind)
  }

}
