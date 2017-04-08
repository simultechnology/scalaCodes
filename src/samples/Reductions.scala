package samples

/**
  * Created by t_ishikawa on 2016/12/25.
  */
object Reductions {

  def main(args: Array[String]): Unit = {

    val ints = reduce(20L)

    //println(ints)

    println(ints)
    reduce2(20L)

  }

  def reduce(n: Long): Seq[Long] = {

    (1L to n).reverse.toArray.filter(x => n % x == 0).reverse

  }

  def reduce2(n: Long) = {

    var result = calc(1, n)
    while (result._2 != 0) {
      result = calc(result._2, result._3)
//      if (result._1) {
//        println(result._2, result._3)
//      }
    }

  }

  def calc(s: Long, e: Long): (Boolean, Long, Long) = {
    if (s <= e) {
      if (e % s == 0) {
        println(s, e / s)
        (true, s + 1, e / s)
      } else {
        (false, s + 1, e)
      }
    } else {
      (false, 0, 0)
    }

  }



}
