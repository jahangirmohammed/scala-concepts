/**
 * Created by jahangirmohammed on 9/25/16.
 */
/**
 * Higher order function satisfies at least one-
 *  i. Takes functions as arguments(one or more).
 * ii. Returns function as result.
 *
 */
object Hof extends App{

  //msgFormat is a HOF.
  def msgFormat(operationName: String, x: Int, y: Int, f: (Int, Int) => Int) = {
    val msg = "The %s of %d and %d is %d."
    msg.format(operationName, x, y, f(x, y))
  }

  def add(x: Int, y: Int) = x+y

  def mul(x: Int, y: Int) = x*y

  println(msgFormat("addition",3,4,add))

  println(msgFormat("addition",3,4,mul))


}

/*
Sample output -
The addition of 3 and 4 is 7.
The addition of 3 and 4 is 12.
 */