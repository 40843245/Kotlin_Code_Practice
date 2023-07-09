# ex4
## ideone
### code
  
     fun main(args: Array<String>) 
    {
    	val number = 10;
    	val threshold = 11;
    	var msg : String;
	
	  msg = if(number > threshold)
    {
    	println("number:$number");
    	println("threshold:$threshold");
    	println("greater");
    	"$number > $threshold";
    }
    else if(number == threshold)
    {
    	println("number:$number");
    	println("threshold:$threshold");
    	println("equal");
    	"$number == $threshold";
    }else
    {
    	println("number:$number");
    	println("threshold:$threshold");
    	println("less");
    	"$number < $threshold";
    };
    
    println(msg);
    }
### output
    number:10
    threshold:11
    less
    10 < 11
### screenshot
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/14c36bbf-8e12-43d7-a031-ef1fbc6eb192)



    

