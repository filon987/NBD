package NBD2

class Person1(val firstName: String, val lastName: String, val taxToPay: BigDecimal = BigDecimal(0.00)) {}

trait Employee extends Person1 {
  var salary: BigDecimal = BigDecimal(2000)
  override val taxToPay: BigDecimal = BigDecimal(0.20)
}

trait Teacher extends Employee {
  override val taxToPay: BigDecimal = BigDecimal(0.10)
}

trait Student extends Person1 {
  override val taxToPay: BigDecimal = BigDecimal(0)
}

object Zadanie5 {
  def main(args: Array[String]) = {
    val e1 = new Person1("Bob", "Jenkins") with Employee
    println(e1.taxToPay)

    val t1 = new Person1("JJ", "Joker") with Teacher
    println(t1.taxToPay)

    val s1 = new Person1("Peter", "Parker") with Student
    println(s1.taxToPay)

    val s2 = new Person1("Miles", "Morales") with Student with Employee
    val s3 = new Person1("Jared", "Leto") with Employee with Student

    println(s2.taxToPay, " : ", s3.taxToPay)



  }
}
