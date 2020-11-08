package NBD2

class BankAccount(private var account_balance: Double) {
  def this(){
    this(0)
  }

  def balance: Double = account_balance

  def deposit(amount: Double) = {
    if(amount > 0)
      this.account_balance += amount
  }

  def withdrawal(amount: Double) = {
    if(amount > 0 && amount <= this.balance)
      account_balance -= amount
    else
      println("You have not enought money on your account.")
  }
}

object Zadanie2 {
  def main(args: Array[String]): Unit = {
    val ac1 = new BankAccount()
    println(ac1.balance)

    val ac2 = new BankAccount(24.24)
    println(ac2.balance)

    ac2.withdrawal(100)
    println(ac2.balance)

    ac2.withdrawal(12.12)
    println(ac2.balance)

    ac2.deposit(50)
    println(ac2.balance)

  }
}
