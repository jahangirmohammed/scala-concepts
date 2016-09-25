/**
 * Created by jahangirmohammed on 9/25/16.
 */

/**
 * Salient things about Tail Recursion in Scala:
 * 1. Recursive call is the only thing at the tail end or last line of function.
 * 2. Scala can compile the tail calls to iteration.
 *
 */

object TailRecursion extends App {

  // Add first N integers.
  def addNIntegers(n: Int): Int = {
    def loop(n: Int, acc: Int): Int = {
      if(n == 0) acc
      else loop(n-1,n+acc)
    }
    loop(n-1,n)
  }

  println("Addition of first 5 integers is: "+addNIntegers(5))

}

/*
Sample output -
Addition of first 5 integers is: 15
 */