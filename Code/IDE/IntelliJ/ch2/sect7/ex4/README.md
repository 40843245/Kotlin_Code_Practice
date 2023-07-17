# ex4
## IntelliJ
### code
    import java.util.function.BinaryOperator
    import java.util.function.IntBinaryOperator
    
    enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
        PLUS {
            override fun apply(t: Int, u: Int): Int = t + u
        },
        TIMES {
            override fun apply(t: Int, u: Int): Int = t * u
        };
    
        override fun applyAsInt(t: Int, u: Int) = apply(t, u)
    }
    
    fun main() {
        val a = 13
        val b = 31
        for (f in IntArithmetics.values()) {
            println("$f($a, $b) = ${f.apply(a, b)}")
        }
    }
### output
    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=50835:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v2\out\production\IntelliJ_Kotlin_test_v2;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar MainKt
    PLUS(13, 31) = 44
    TIMES(13, 31) = 403
    
    Process finished with exit code 0
