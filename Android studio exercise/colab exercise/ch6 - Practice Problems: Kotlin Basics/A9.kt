/*
Q at:
https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-kotlin-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-intro-kotlin-practice-problems#9
*/

fun compareTime(timeSpentToday:Int,timeSpentYesterday:Int):Boolean{
  return timeSpentToday >= timeSpentYesterday
}
fun main(){
  // Example 1
  println(compareTime(timeSpentToday=300,timeSpentYesterday=250))
  // Example 2
  println(compareTime(timeSpentToday=300,timeSpentYesterday=300))
  // Example 3
  println(compareTime(timeSpentToday=200,timeSpentYesterday=220))
}
