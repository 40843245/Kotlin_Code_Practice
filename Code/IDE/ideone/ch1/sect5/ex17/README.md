# ex17
## ideone
### code
    fun main(args: Array<String>) 
    {
        var i : Int;
      	for(i in 0.rangeTo(10) step -1)
      	{
      		println(i);
      	}
    }
### output
Runtime error:

### reason of Runtime error
Due to the syntax and usage of the keyword rangeTo,

      {start}.rangeTo({end}) step {step}

In this example, we substitute {start} as 0 , {end} as 10 and {step} as -1.

Thus, the for-loop is infinite.




