# ex1
## ideone
### code
    fun main(args: Array<String>) 
    {
    val i : Long = 54321;
    println(i is Long);
    println(i is Int);
    println(i is Short);
    println(i is Byte);
    }
### output
Compiler Error:

    prog.kt:5:18: error: incompatible types: Int and Long
    println(i is Int);
                 ^
    prog.kt:6:18: error: incompatible types: Short and Long
      println(i is Short);
                 ^
    prog.kt:7:18: error: incompatible types: Byte and Long
      println(i is Byte);
### expected output
There are no Compiler Error.

      true
      false
      false
      false
### screenshot
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/16469867-0c01-4a0d-b10c-50283b878938)


    
