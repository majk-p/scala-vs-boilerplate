enum Animal(name: String):
  case Dog(name: String) extends Animal(name)
  case Burek extends Animal("Burek")
  case Cat(name: String) extends Animal(name)
  case Horse(name: String, weight: Double) extends Animal(name)
  case Snake(name: String, length: Double) extends Animal(name)

import Animal.*

def filterAnimals(animals: Seq[Animal]) = 
  animals.collect {
    case cat @ Cat(s"A$_")  => cat
    // case cat @ Cat(name) if name.startsWith("A")  => cat // Alternative
    case snake @ Snake(_, length) if length > 1.5 => snake
  }



@main
def main() =
  val testData = List(
    Dog("Doge"), Burek, Cat("A"), Cat("B"),
    Snake("Python", 2.0), Snake("Snek", 0.5)
  )
  println(filterAnimals(testData))