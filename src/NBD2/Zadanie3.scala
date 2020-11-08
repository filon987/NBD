package NBD2

case class Person(firstName: String, lastName: String)

object Zadanie3 {
  def greet(person: Person) = person match {
    case Person("Filip", _) => "Hello Filip, how are you today?"
    case Person("Adam", _) => "Hello Adam, Welcome back."
    case Person("Michał", _) => "Hello Michał. Have a nice day."
    case _ => "Welcome Mr./Mrs. " + person.lastName
  }

  def main(args: Array[String]) = {
    val p1 = Person("Filip", "S")
    val p2 = Person("Adam", "W")
    val p3 = Person("Michał", "D")
    val p4 = Person("Mikołaj", "M")

    println(greet(p1))
    println(greet(p2))
    println(greet(p3))
    println(greet(p4))
  }
}
