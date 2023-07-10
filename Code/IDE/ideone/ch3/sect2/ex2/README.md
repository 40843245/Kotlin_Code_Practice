# ex1 
## ideone
### code
    fun main() 
    {
        val numbers = mutableListOf("one", "two", "three")
        val firstAndLast = with(numbers) 
        {
            "The first element is ${first()}," +
            " the last element is ${last()}"
        }
        println(firstAndLast)
    }
### output
    The first element is one, the last element is three
