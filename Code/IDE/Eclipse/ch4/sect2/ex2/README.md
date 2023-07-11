# ex2
## Eclipse
### code
### output

  import kotlinx.coroutines.*
  // import java.io.Serializable
  // import java.io.*;
  

  fun main() = runBlocking {
	
	val list1 : IntRange = (1..3);
	
    val deferreds: List<Deferred<Int>> = list1.map {
        	async {
            delay(1000L * it);
            println("Loading $it");
            it;
        }
    };
	
     val sum = deferreds.awaitAll().sum();
     println("$sum");
}
