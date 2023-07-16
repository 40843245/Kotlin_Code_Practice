# ex2
## IntelliJ
### code
    import kotlin.test.assertNotEquals;
    
    class Sample() {
    
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
    
    internal class SampleTest {
    
        private val testSample: Sample = Sample()
    
    
        fun testSum() {
            val expected = 43
            // assertEquals(expected, testSample.sum(40, 2))
            assertNotEquals(expected, testSample.sum(40, 2))
        }
    }
### output
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/0e703b3c-901d-46af-bf7d-1a563ac55e48)
