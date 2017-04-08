package ch6

/**
  * Created by t_ishikawa on 2016/12/25.
  */
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + denom * that.numer,
      denom * that.denom
    )

  def + (that: Rational): Rational =
    this.add(that)

  def * (that: Rational): Rational =
    new Rational(
      numer * that.numer, denom * that.denom
    )

  def lessThan(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  override def toString: String = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  //println("Created : " + this)
}

