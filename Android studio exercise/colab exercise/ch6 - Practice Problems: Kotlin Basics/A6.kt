/*
Q at:
https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-kotlin-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-intro-kotlin-practice-problems#6
*/

/*
2. Can you define the add() function so that the program prints this output?
Yes.

The add function is shown as below.
*/

fun add(arg1:Int,arg2:Int):Int{
  return arg1 + arg2
}
/*
1. Can you fix the error so that the program prints this output?
Yes.

The code after fix is as follows.
*/

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    // val result = firstNumber + secondNumber
    val result = add(firstNumber,secondNumber)
    println("$firstNumber + $secondNumber = $result")
}


