object Main {
  def main(args: Array[String]): Unit = {
    // Types of Operator in Scala
    // 1. Arithematic
    // 2. Assignment
    // 3. Conditional
    // 4. Bitwise
    // 5. Logical

    // 1. Arithematic 

    // +, -, %, **, *, / 
    var a = 10 // Auto detecting of data type is called as type inference
    var b = 20 // Auto detecting of data type is called as type inference
    println("The value of a+b is ", a+b)
    println("The value of a-b is ", a-b)
    println("The value of a/b is ", a/b)
    println("The value of a*b is ", a*b)
    println("The value of a%b is ", a%b)
    // 2. Assignment
    // =, +=, -=, *=, /=, %=, &=, ~= 
    var x = 100
    x += 10 // x = x+10
    println("Value of x after +=: ", x)
    x -= 10 // x = x-10
    println("The value of x after -= ", x)
    x /= 10 // x = x/10
    println("The value of x after /= ", x)
    x %= 2 // x = x%2
    print("The value of x after %= ", x)

    // 3. Conditional 
    // >, <, <=, >=, ==, !=
    println("Value of a and b is: ", a, b)
    println("The boolean value for a>b is ",a>b)
    println("The boolean value for a<b is ", a<b)
    println("The value for a <=b is ", a<=b)
    println("The value for a>=b is ", a>=b)
    println("The value for a == b is : ", a == b)
    println("The value for a !=b is : ", a!=b)

    // 4. Logical
    var t: Boolean = true
    var u: Boolean = false
    println("The value of t is: ", t)
    println("The value of u is: ", u)
    println("Logical And Operator: ", t&&u)
    println("Logical Or Operator: ", t||u)
    println("Logical Not Operator: ", !t)
    println("Logical EXOR Operator: ", t^u)

    // 5. Bitwise (Rarely used)

    println("The value of a is : ", a)
    println("The value of b is: ", b)
    println("The bitwise left shift by 5 on a: ", a<<5)
    println("The value of bitwise right shift by 5 on b is: ", a >> 5)
  println("The value of bitwise and operator on a and b is: ", a&b)
  println("The value of bitwise or operator on a and b is, ", a|b)



/*
(The value of a+b is ,30)
(The value of a-b is ,-10)
(The value of a/b is ,0)
(The value of a*b is ,200)
(The value of a%b is ,10)
(Value of x after +=: ,110)
(The value of x after -= ,100)
(The value of x after /= ,10)
(The value of x after %= ,0)(Value of a and b is: ,10,20)
(The boolean value for a>b is ,false)
(The boolean value for a<b is ,true)
(The value for a <=b is ,true)
(The value for a>=b is ,false)
(The value for a == b is : ,false)
(The value for a !=b is : ,true)
(The value of t is: ,true)
(The value of u is: ,false)
(Logical And Operator: ,false)
(Logical Or Operator: ,true)
(Logical Not Operator: ,false)
(Logical EXOR Operator: ,true)
(The value of a is : ,10)
(The value of b is: ,20)
(The bitwise left shift by 5 on a: ,320)
(The value of bitwise right shift by 5 on b is: ,0)
(The value of bitwise and operator on a and b is: ,0)
(The value of bitwise or operator on a and b is, ,30)
*/
  }
}
