import scala.io.StdIn.readLine

object Tree extends App {
  println(s"Please enter your Integer Number")
  var height = readLine().toInt
  if (height <= 3) {
    println(" " * 2 + "*")
    println(" " + "*" * 3)
    println("*" * 5)
  }
  else {
    var i = 0
    while (i <= height) {
      val space = height - i
      val length = 2 * i - 1
      println(" " * space + "*" * length)
      i += 1
    }
  }
}
