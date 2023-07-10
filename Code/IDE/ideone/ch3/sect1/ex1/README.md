# ex1
## ideone
### code
    fun main() 
    {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        val resultList = numbers.map { it.length }.filter { it > 3 }
        println(resultList)    
    }
### output

  [5, 4, 4]
