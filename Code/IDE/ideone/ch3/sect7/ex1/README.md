# ex1
## ideone
### code
    import kotlin.random.*    
    fun main() 
    {
        val number = Random.nextInt(100)
    
        val evenOrNull = number.takeIf { it % 2 == 0 }
        val oddOrNull = number.takeUnless { it % 2 == 0 }
        println("even: $evenOrNull, odd: $oddOrNull")
    }
### output
    even: null, odd: 87
