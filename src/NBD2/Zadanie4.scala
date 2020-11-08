package NBD2

object Zadanie4 {
  def function(a: Int, f: Int => Int): Int = {
    f(f(f(a)))
  }

  def main(args: Array[String]): Unit = {
    val result = function(2, { a: Int => a + 1 })
    println(result)
  }
}
