import scala.util.Try

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
    * Option data type is one of dealing with exceptions which is used to represent that a function doesn't have an answer always.
    */
  def rollNumber(name: String): Option[Student] = studentsData.get(name).map(no => Student(name, no))


  /**
    * Either data type is a disjoint union of two types to indicate success or failure where by convention Right is used
    * for success case and Left is used for failure. It provides more information than Option.
    * Equivalent of this function is Try which provides either Exception or value.
    */
  def rollNo(name: String): Either[Exception, Student] =
    try Right(rollNumberOld(name))
    catch { case e: Exception => Left(e)}

  println("rollNumberOld(Aman) "+ rollNumberOld("Aman"))

  println("rollNumber(A) "+rollNumber("A"))

  println("rollNumber(Aman) "+rollNumber("Aman"))

  println("rollNo(Aman) "+rollNo("Aman"))

  println("rollNo(A) "+rollNo("A"))

  println(Try("1".toInt))

  println(rollNumberOld("A"))

}
