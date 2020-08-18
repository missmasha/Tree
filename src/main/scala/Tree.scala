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
    for (i <- height to height) {
      var j = 0
      while (j <= i) {
        val space = i - j
        val length = 2 * j - 1
        println(" " * space + "*" * length)
        j += 1
      }
    }
  }
}
