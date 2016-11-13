/**
  * Created by jahangir on 11/13/16.
  */

case class Student(name: String, rollNumber: Int)

object Exceptions extends App {

  val studentsData = Map("Aman" -> 1, "Arham" -> 2, "Joy" -> 3)


  /**
    * Exceptions -
    * 1. Exceptions break referential transparency.
    * 2. Exceptions are not type-safe i.e. doesn't tell the caller of function whether exceptions may occur or how to handle.
    */
  def rollNumberOld(name: String): Student = {
    if(!studentsData.contains(name))
      throw new Exception("Student doesn't exist")
    else
      Student(name,studentsData.get(name).get)
  }

  /**
    * Option datatype is one of dealing with exceptions which is used to represent that a function doesn't have an answer always.
    */
  def rollNumber(name: String): Option[Student] = studentsData.get(name).map(no => Student(name, no))

  println(rollNumberOld("Aman"))

  println(rollNumber("A"))

  println(rollNumber("Aman"))

  println(rollNumberOld("A"))

}
