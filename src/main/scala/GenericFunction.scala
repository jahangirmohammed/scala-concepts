/**
  * Created by jahangir on 10/13/16.
  */

/**
  * Polymorphic or generic functions abstract over the type and there are type parameters surrounded by square brackets.
  */
object GenericFunction extends App {

  def isSorted[A](arr: Array[A], orderFunc: (A,A) => Boolean): Boolean = {
    val listRepr = arr.toList
    listRepr.view.zip(listRepr.tail).forall(x => orderFunc(x._1,x._2))
  }

  println(isSorted(Array(1,2,3),(x: Int, y: Int) => x <= y)) // (x: Int, y: Int) => x <= y is an anonymous function or function literal.
  println(isSorted(Array(1,1,3),(x: Int, y: Int) => x <= y))
  println(isSorted(Array(1,-1,3),(x: Int, y: Int) => x <= y))
}
