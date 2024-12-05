
@main
def main(): Unit = {
  val r1 = new Rational(1, 2)
  val r2 = new Rational(2, 3)

  println(s"r1: $r1")
  println(s"r2: $r2")
  println(s"r1 + r2: ${r1 + r2}")
  println(s"r1 - r2: ${r1 - r2}")
  println(s"r1 * r2: ${r1 * r2}")
  println(s"r1 / r2: ${r1 / r2}")
}

