package NBD2

object Zadanie1 {

  def dayOfTheWeek(day_of_the_week: String) = day_of_the_week match {
    case "Monday" => "Working day"
    case "Tuesday" => "Working day"
    case "Wednesday" => "Working day"
    case "Thursday" => "Working day"
    case "Friday" => "Working day"
    case "Saturday" => "Weekend"
    case "Sunday" => "Weekend"
    case _ => "Day doesn't exist"
  }

  def main(args: Array[String]): Unit = {
    val days = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Moonday")
    for (day <- days)
      println(day + ": " + dayOfTheWeek(day))
  }
}
