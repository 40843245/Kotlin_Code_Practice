# ex3
## ideone
### code
    fun Add(a:Int ,  b:Int) : Int 
    {
    	return a + b;
    }
    fun Print(a:Int , b:Int)
    {
    	println("a=$a,b=$b,"+"Add($a,$b)="+Add(a,b));
    }
    fun main(args: Array<String>) 
    {
    	Print(3,5);
    	Print(2,4);
    }
### output
    a=3,b=5,Add(3,5)=8
    a=2,b=4,Add(2,4)=6
