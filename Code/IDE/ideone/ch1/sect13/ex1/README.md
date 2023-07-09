# ex1
## ideone
### code
    fun Print(obj:Any)
    {
    	println("----------------------");
    	if (obj !is String)  // same as !(obj is String)
    	{
        	print("Not a String.");
    	} else {
    		print("Is a String,length:");
        	print(obj.length);
    	}
    	println();
    }
    fun main(args: Array<String>)
    {
    	val number = 2;
    	val s1 = "String";
    	val longNumber = 2L;
    	Print(number);
    	Print(s1);
    	Print(longNumber);
    }
### output  
    ----------------------
    Not a String.
    ----------------------
    Is a String,length:6
    ----------------------
    Not a String.
