object Drawrect {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    while (cases > 0) {
      var result = List[Int]()
      val a: List[Int] = readLine().split(" ").map(_.toInt).toList
      val b: List[Int] = readLine().split(" ").map(_.toInt).toList
      val c: List[Int] = readLine().split(" ").map(_.toInt).toList
      if ( a(0) == b(0) ) {
        result =  result :+ c(0)
      } else if ( a(0) == c(0) ) {
        result = result :+ b(0)
      } else {
        result =  result :+ a(0)
      }
      if ( a(1) == b(1) ) {
        result =  result :+ c(1)
      } else if ( a(1) == c(1) ) {
        result =  result :+ b(1)
      } else {
        result =  result :+ a(1)
      }
      println(result.mkString(" "))
      cases -= 1
    }
  }
}
