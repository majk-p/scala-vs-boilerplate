
extension (x: List[Int])
  def odds = x.filter(_ % 2 == 1)

@main
def main() =
  val testData = (1 to 10).toList
  println(testData.odds)


// This will not compile 
// @main
// def main() =
//   val testData = List("123", "456")
//   println(testData.odds)