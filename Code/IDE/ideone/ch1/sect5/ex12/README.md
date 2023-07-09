# ex12
## ideone
### code
    fun main(args: Array<String>) 
    {
	    var i : Int;
	  	for(i in rangeTo(0,10,1))
	  	{
	  		println(i);
	  	}
    }
### output
Compiler Error:
        
      prog.kt:4:14: error: unresolved reference: rangeTo
	  	for(i in rangeTo(0,10,1))
             ^
	prog.kt:6:6: error: overload resolution ambiguity: 
	public inline fun println(message: Any?): Unit defined in kotlin.io
	public inline fun println(message: Boolean): Unit defined in kotlin.io
	public inline fun println(message: Byte): Unit defined in kotlin.io
	public inline fun println(message: Char): Unit defined in kotlin.io
	public inline fun println(message: CharArray): Unit defined in kotlin.io
	public inline fun println(message: Double): Unit defined in kotlin.io
	public inline fun println(message: Float): Unit defined in kotlin.io
	public inline fun println(message: Int): Unit defined in kotlin.io
	public inline fun println(message: Long): Unit defined in kotlin.io
	public inline fun println(message: Short): Unit defined in kotlin.io
	    println(i);
	     ^


### reason of Compiler error
Due to the misuse of the keyword rangeTo.

For more details about the syntax of rangeTo, see the Kotlin official Docs.

### Ref
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/range-to.html
    

