# ex4
## ideone
### code
    fun main(args: Array<String>) 
    {
    val i : Int = 54321;
    println(i is Long);
    println(i is Int);
    println(i is Short);
    println(i is Byte);
     }
### output
Compiler Error

    prog.kt:4:18: error: incompatible types: Long and Int
    println(i is Long);
                 ^
    prog.kt:6:18: error: incompatible types: Short and Int
    println(i is Short);
                 ^
    prog.kt:7:18: error: incompatible types: Byte and Int
    println(i is Byte);

### expected output
There are no Compiler Error.

I think it does so because

in Kotlin official Docs, it says that implicit conversion from type of smaller number to type of bigger number.

But in online IDE ideone, it throw Compiler Error.

### screenshot
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/058c913c-f2ed-4394-b766-9ba64cebeebe)


    
