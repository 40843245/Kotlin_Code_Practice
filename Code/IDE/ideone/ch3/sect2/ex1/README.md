# ex1
## ideone
### code
    fun main() 
    {
        val numbers = mutableListOf("one", "two", "three")
        with(numbers) 
        {
            println("'with' is called with argument $this")
            println("It contains $size elements")
        }
    }
### output
    'with' is called with argument [one, two, three]
    It contains 3 elements
