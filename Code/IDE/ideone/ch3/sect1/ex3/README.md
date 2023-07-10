# ex3
## ideone
### code
    fun main() 
    {
      val numbers = mutableListOf("one", "two", "three", "four", "five")
      numbers.map { it.length }.filter { it > 3 }.let(::println)
    }
### output

  [5, 4, 4]
