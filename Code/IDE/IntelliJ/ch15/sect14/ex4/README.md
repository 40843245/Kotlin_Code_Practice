# ex4
## IntelliJ
### code
    import org.testng.Assert.assertNotSame
    import kotlin.test.expect
    
    class Sample() {
    
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
    
    internal class SampleTest {
    
        private val testSample: Sample = Sample()
        var expected  = List<Int>(5) {it *2};
        public fun testSum()
        {
            println(expected);
            expect<List<Byte>>(expected,{ List<Int>(expected.size) {it * 2} } );
        }
    }
    
    fun main()
    {
        val sampleTest = SampleTest();
    
        sampleTest.testSum();
    }
### output
Compiler Error

    C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v3\src\main\kotlin\Main.kt:18:28
    Kotlin: Type mismatch: inferred type is List<Int> but List<Byte> was expected

### reason
Compiler Error since mismatched type.
