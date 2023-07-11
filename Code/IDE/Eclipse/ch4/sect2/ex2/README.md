# ex2
## Eclipse
### code

  	import kotlinx.coroutines.*
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


### output
	Loading 1
	Loading 2
	Loading 3
	6
