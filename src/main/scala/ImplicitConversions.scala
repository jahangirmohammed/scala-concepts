/**
  * Created by jahangir on 1/13/17.
  */


object ImplicitConversions extends App {

  val port = "8080"

  implicit def string2int(s: String) = s.toInt

  //Below wouldn't have been possible if there wasn't an implicit conversion from String to Int.
  println(port > 20)

}
