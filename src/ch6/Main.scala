package ch6

/**
  * Created by t_ishikawa on 2016/12/25.
  */
object Main {

  def main(args: Array[String]): Unit = {
    val r1 = new Rational(1, 2)
    val r2 = new Rational(5, 7)
    //val r3 = new Rational(5, 0)
    val r3: Rational = r1.add(r2)

    println(r1.lessThan(r2))
    println(r1.max(r2))

    val r4 = new Rational(5)

    val r5 = new Rational(66, 42)

    println(r4 + r5)
    println(r4 * r5)

    val r6: Rational = new Rational(2, 3)

    println(r1 + r6)
    println(r1 * r6)
  }

}
