# ex1
## ideone
### code
    data class Person(var name: String, var age: Int = 0, var city: String = "")
    
    fun main() 
    {
        val adam = Person("Adam").apply 
        {
            age = 32
            city = "London"        
        }
        println(adam)
    }
### output
    
    Person(name=Adam, age=32, city=London)
