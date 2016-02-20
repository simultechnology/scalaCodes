package c16

object ListSample1 {
  def main (args: Array[String]): Unit = {
    println("start!")

    val fruits = "banana" :: "apple" :: "orange" :: Nil
    println(fruits)

    val fruits2 = "mango" :: fruits
    println(fruits2)

    val List(a, b, c, d) = fruits2
    printf("%s , %s , %s , %s\n", a, b, c, d)

    val intList = List(3, 500, 7, 4, 2, 98, 24, 111, 1, 32)

    val ints: List[Int] = isort(intList)
    println(ints)

    val ints1: List[Int] = insert(10, intList)
    println(ints1)

  }

  def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

}
