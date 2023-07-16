# ex1
## IntelliJ
### code
    import kotlin.test.assertEquals;
    import org.testng.annotations.Test;
    
    class Sample() {
    
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
    
    internal class SampleTest {
    
        private val testSample: Sample = Sample()
    
        @Test
        fun testSum() {
            val expected = 42
            assertEquals(expected, testSample.sum(40, 2))
        }
    }
### output
Success. The output in Run console.

    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=63009:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\plugins\testng\lib\testng-rt.jar;C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v4\out\production\IntelliJ_Kotlin_test_v4;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\user\.m2\repository\org\testng\testng\7.1.0\testng-7.1.0.jar;C:\Users\user\.m2\repository\com\beust\jcommander\1.72\jcommander-1.72.jar;C:\Users\user\.m2\repository\com\google\inject\guice\4.1.0\guice-4.1.0-no_aop.jar;C:\Users\user\.m2\repository\javax\inject\javax.inject\1\javax.inject-1.jar;C:\Users\user\.m2\repository\aopalliance\aopalliance\1.0\aopalliance-1.0.jar;C:\Users\user\.m2\repository\com\google\guava\guava\19.0\guava-19.0.jar;C:\Users\user\.m2\repository\org\yaml\snakeyaml\1.21\snakeyaml-1.21.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-test\1.9.0\kotlin-test-1.9.0.jar;C:\Users\user\eclipse\java-2023-06\eclipse\configuration\org.eclipse.osgi\545\0\.cp\lib\kotlin-test-1.9.0.jar" com.intellij.rt.testng.RemoteTestNGStarter -usedefaultlisteners false -socket63008 @w@C:\Users\user\AppData\Local\Temp\idea_working_dirs_testng.tmp -temp C:\Users\user\AppData\Local\Temp\idea_testng.tmp
    
    ===============================================
    Default Suite
    Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
    ===============================================
    
    
    Process finished with exit code 0
