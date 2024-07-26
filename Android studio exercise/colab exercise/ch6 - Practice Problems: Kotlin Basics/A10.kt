/*
Q at:
https://developer.android.com/codelabs/basic-android-kotlin-compose-intro-kotlin-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-intro-kotlin-practice-problems#10
*/

/*
1. Can you create a function that prints the weather details for a single city to reduce the repetition in the main() function and then do the same for the remaining cities?
Yes.

See the following code.

2. Can you update the main() function to call the function that you created for each city and pass in the appropriate weather details as arguments?
Yes.

See the following code.
*/

fun printWeather(city:String,lowTemperature:Int,highTemperature:Int,chanceOfRain:Int){
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
fun main() {
    printWeather(city="Ankara",lowTemperature=27,highTemperature=31,chanceOfRain=82)
    printWeather(city="Tokyo",lowTemperature=37,highTemperature=36,chanceOfRain=10)
    printWeather(city="Cape Town",lowTemperature=59,highTemperature=64,chanceOfRain=2)
    printWeather(city="Guatemala City",lowTemperature=50,highTemperature=55,chanceOfRain=7)
}

/*
The more restricted version of the function printWeather checks the input data.
The code of more restricted version of the function printWeather as follows:
*/

/*
fun printWeather(city:String,lowTemperature:Int,highTemperature:Int,chanceOfRain:Int){
  try {
    // validate the input data
    if(lowTemperature>highTemperature){
        throw Exception("lowTemperature must be greater than or equal to highTemperature.")
    }
    if(chanceOfRain < 0 || chanceOfRain > 100){
      throw Exception("chanceOfRain (percentage) must be between 0 and 100 both inclusive.")
    }
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
  } catch (e: Exception) {
    e.printStackTrace()
  } finally {
    println()
  }
}
*/
