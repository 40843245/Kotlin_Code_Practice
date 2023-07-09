# ex5
## ideone
### code
    fun main(args: Array<String>) 
    {
    val i : Byte = 21;
    println(i is Long);
    println(i is Int);
    println(i is Short);
    println(i is Byte);
    }
### output
Compiler Error.

    prog.kt:4:18: error: incompatible types: Long and Byte
    println(i is Long);
                 ^
    prog.kt:5:18: error: incompatible types: Int and Byte
    println(i is Int);
                 ^
    prog.kt:6:18: error: incompatible types: Short and Byte
    println(i is Short);
### expected output
Same as ../ch1/sect2/ex4

### screenshot
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/d94090f9-9259-48eb-b6f6-e09f60d3799b)


    
