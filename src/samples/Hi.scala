package samples

object Hi {
  def main(args: Array[String]) = println("Hi!")

  val name: Option[String] = Some("ishi")

  val realName : String = name match {
    case Some("taka") => "first-name"
    case Some("") => "nothing"
    case Some(name) => name
  }

  println(realName)
}
