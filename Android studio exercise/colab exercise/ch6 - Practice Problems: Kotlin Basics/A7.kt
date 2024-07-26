/*
Q at:
https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-kotlin-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-intro-kotlin-practice-problems#7
*/

/*
1. Can you implement the displayAlertMessage() function in this program so that it prints the output displayed?
Yes.

The displayAlertMessage function is defined as follows.
*/

fun displayAlertMessage(operatingSystem:String = "Unknown OS",emailId:String = ""):String{
  val result = "There's a new sign-in request on "+operatingSystem+" for your Google Account "+ emailId +"."
  return result
}

/*
2.Does your program print this output?
Yes.
*/

/*
3. Can you find a way to optimize the code with this information so that it prints this output?

```
There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com. 
```

Yes.
*/

fun main(){
  println(displayAlertMessage("Unknown OS","user_one@gmail.com"))
  println("")
  println(displayAlertMessage("Windows","user_two@gmail.com"))
  println("")
  println(displayAlertMessage("Mac OS","user_three@gmail.com"))
}

/*
4. To print the above message, replace the main() function implementation with this one.

```
There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com. 
```

The displayAlertMessage function is shown as the code for 1th subquestion mentioos.
*/
