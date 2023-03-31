def matchInt(x: Int) = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "other"
}
def matchList(l: List[Int]) = l match {
  case List(1, 2, 3) => "one, two three"
  case 1 :: 1 :: 2 :: 3 :: 5 :: _ => "starts like Fibonacci"
  case anything if anything.forall(_ > 0) => "list of positive numbers"
  case List(9, 9, x) => s"nine nine and $x"
  case _ => "just a list"
}
