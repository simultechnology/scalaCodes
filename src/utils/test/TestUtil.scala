package utils.test

/**
  * Created by t_ishikawa on 2016/02/20.
  */
object TestUtil {

  def main(args: Array[String]): Unit = {
    println("start!")

    var sum = 0d
    (1 to 78).foreach { sum += 0.1; println }
    println(f"sum : ${sum}")

    var sum2 = 0d
    for (x <- 1 to 78) {
      sum2 += 0.1
    }
    println(f"sum : ${sum2}")

    val round: Long = (Math.round(sum2 * 100)) / 100
    println(round)

    val double: Double = BigDecimal(sum2).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble
    println(double)

    val double1: Double = BigDecimal(1.23456789).setScale(2, BigDecimal.RoundingMode.HALF_EVEN).toDouble
    println(double1)
  }

}
