# ex1
## ideone
### code
    fun main() 
    {
        val numbers = mutableListOf("one", "two", "three")
        numbers
            .also { println("The list elements before adding new one: $it") }
            .add("four")
    }
### output
    The list elements before adding new one: [one, two, three]
