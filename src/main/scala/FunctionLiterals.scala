/**
  * Created by jahangir on 10/17/16.
  */
/**
  * Function literal like (x: Int, y: Int) => x + y is an object which implements Function traits with method called apply.
  *
  */
object FunctionLiterals extends App {

  val sum = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int) = x + y
  }

  println(sum(10,20))
  println(sum.apply(10,20))

}
