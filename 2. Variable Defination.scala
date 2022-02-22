object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println("My lucky number is 10")

    // Variables:
    val a: Int = 10
    println("The value of variable a is :", a)
    a = 100 // Will result in error as val does not allow reassignment
    var b: Int = 10
    println("The value of variable b is :", b)
    b = 100
    println("The value of variable b after updation is : ", b)
  }
}
