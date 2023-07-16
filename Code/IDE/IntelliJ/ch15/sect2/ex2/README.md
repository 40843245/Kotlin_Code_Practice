# ex2
## Intellij
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
            val expected = 43
            assertEquals(expected, testSample.sum(40, 2))
        }
    }
### output
In Run terminal, you will see the output like this.

    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=63692:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\plugins\testng\lib\testng-rt.jar;C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v4\out\production\IntelliJ_Kotlin_test_v4;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\user\.m2\repository\org\testng\testng\7.1.0\testng-7.1.0.jar;C:\Users\user\.m2\repository\com\beust\jcommander\1.72\jcommander-1.72.jar;C:\Users\user\.m2\repository\com\google\inject\guice\4.1.0\guice-4.1.0-no_aop.jar;C:\Users\user\.m2\repository\javax\inject\javax.inject\1\javax.inject-1.jar;C:\Users\user\.m2\repository\aopalliance\aopalliance\1.0\aopalliance-1.0.jar;C:\Users\user\.m2\repository\com\google\guava\guava\19.0\guava-19.0.jar;C:\Users\user\.m2\repository\org\yaml\snakeyaml\1.21\snakeyaml-1.21.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-test\1.9.0\kotlin-test-1.9.0.jar;C:\Users\user\eclipse\java-2023-06\eclipse\configuration\org.eclipse.osgi\545\0\.cp\lib\kotlin-test-1.9.0.jar" com.intellij.rt.testng.RemoteTestNGStarter -usedefaultlisteners false -socket63691 @w@C:\Users\user\AppData\Local\Temp\idea_working_dirs_testng.tmp -temp C:\Users\user\AppData\Local\Temp\idea_testng.tmp
  
    java.lang.AssertionError: Expected <43>, actual <42>.
  
  	at kotlin.test.DefaultAsserter.fail(DefaultAsserter.kt:16)
  	at kotlin.test.Asserter$DefaultImpls.assertTrue(Assertions.kt:652)
  	at kotlin.test.DefaultAsserter.assertTrue(DefaultAsserter.kt:11)
  	at kotlin.test.Asserter$DefaultImpls.assertEquals(Assertions.kt:671)
  	at kotlin.test.DefaultAsserter.assertEquals(DefaultAsserter.kt:11)
  	at kotlin.test.AssertionsKt__AssertionsKt.assertEquals(Assertions.kt:63)
  	at kotlin.test.AssertionsKt.assertEquals(Unknown Source)
  	at kotlin.test.AssertionsKt__AssertionsKt.assertEquals$default(Assertions.kt:62)
  	at kotlin.test.AssertionsKt.assertEquals$default(Unknown Source)
  	at SampleTest.testSum(Main.kt:18)
  	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
  	at java.base/java.lang.reflect.Method.invoke(Method.java:578)
  	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:134)
  	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:597)
  	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)
  	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
  	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:816)
  	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)
  	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
  	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
  	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
  	at org.testng.TestRunner.privateRun(TestRunner.java:766)
  	at org.testng.TestRunner.run(TestRunner.java:587)
  	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
  	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
  	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
  	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
  	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
  	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
  	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)
  	at org.testng.TestNG.runSuitesLocally(TestNG.java:1109)
  	at org.testng.TestNG.runSuites(TestNG.java:1039)
  	at org.testng.TestNG.run(TestNG.java:1007)
  	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
  	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:105)
    
    
    ===============================================
    Default Suite
    Total tests run: 1, Passes: 0, Failures: 1, Skips: 0
    ===============================================
    
    
    Process finished with exit code 0
