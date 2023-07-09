# ex9
## ideone
### code
    fun main(args: Array<String>) 
    {
    	var i : Int;
    	for(i in 0..<10 step 2)
    	{
    		println(i);
    	}
    }
### output
Compiler Error:
        
    prog.kt:4:14: error: expecting an element
    	for(i in 0..<10 step 2)
                 ^
    prog.kt:4:15: error: expecting ')'
    	for(i in 0..<10 step 2)
                  ^
    prog.kt:4:24: error: unexpected tokens (use ';' to separate expressions on the same line)
    	for(i in 0..<10 step 2)
                           ^
    prog.kt:4:18: error: unresolved reference. None of the following candidates is applicable because of receiver type mismatch: 
    public infix fun CharProgression.step(step: Int): CharProgression defined in kotlin.ranges
    public infix fun IntProgression.step(step: Int): IntProgression defined in kotlin.ranges
    public infix fun LongProgression.step(step: Long): LongProgression defined in kotlin.ranges
    public infix fun UIntProgression.step(step: Int): UIntProgression defined in kotlin.ranges
    public infix fun ULongProgression.step(step: Long): ULongProgression defined in kotlin.ranges
    	for(i in 0..<10 step 2)
                 ^
    prog.kt:6:11: error: variable 'i' must be initialized
    		println(i);
              ^
### expected output
It should be no Compiler Error. Instead, it should print
  
    0
    2
    4
    6
    8

It seems that the problem is same as ../ch1/sect5/ex8

![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/3b05904c-73cc-469e-a366-b6242d24a8d5)

### Ref
https://kotlinlang.org/docs/ranges.html
