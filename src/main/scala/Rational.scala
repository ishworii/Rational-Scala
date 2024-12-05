import scala.annotation.tailrec

class Rational(n : Int, d : Int):
  require(d != 0)
  private val g = gcd(n,d)
  private val num : Int = n / g
  private val den : Int = d / g
  def this(n : Int) = this(n,1)
  override def toString: String = s"$num/$den"

  def +(that:Rational) : Rational = {
    Rational(num*that.num + den * that.den,den * that.den)
  }

  def +(other : Int) : Rational = {
    Rational(num + other * den , den)
  }

  def -(that : Rational) : Rational = {
    Rational(num*that.num - den * that.den,den * that.den)
  }

  def *(that:Rational) : Rational = {
    Rational(num * that.num,den*that.den)
  }

  def /(that:Rational) : Rational = {
    Rational(num * that.den,den*that.num)
  }

  @tailrec
  private def gcd(a : Int, b : Int) : Int = {
    if(b == 0) a else gcd(b,a%b)
  }