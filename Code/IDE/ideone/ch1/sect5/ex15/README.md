# ex15
## ideone
### code
    fun main(args: Array<String>) 
    {
        var i : Int;
      	for(i in 10.rangeTo(0) step 1)
      	{
      		println(i);
      	}
    }
### output
None

### reason of output is None
Due to the syntax and usage of the keyword rangeTo,

      {start}.rangeTo({end}) step {step}

In this example, we substitute {start} as 10, {end} as 0 and {step} as 1.

Thus, it is impossible to jump into the for-loop.




