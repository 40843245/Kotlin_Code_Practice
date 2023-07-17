# ex1
## IntelliJ
### code
    data class Product(val name: String, val price: Double)
    
    fun main() {
        val productList = listOf(
            Product("WebStorm", 49.0),
            Product("AppCode", 99.0),
            Product("DotTrace", 129.0),
            Product("ReSharper", 149.0))
    
        println(productList.binarySearch(Product("AppCode", 99.0), compareBy<Product> { it.price }.thenBy { it.name }))
    }
### output
    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=53064:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v3\out\production\IntelliJ_Kotlin_test_v3;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\user\eclipse\java-2023-06\eclipse\configuration\org.eclipse.osgi\545\0\.cp\lib\kotlin-test-1.9.0.jar;C:\Users\user\.m2\repository\org\testng\testng\7.1.0\testng-7.1.0.jar;C:\Users\user\.m2\repository\com\beust\jcommander\1.72\jcommander-1.72.jar;C:\Users\user\.m2\repository\com\google\inject\guice\4.1.0\guice-4.1.0-no_aop.jar;C:\Users\user\.m2\repository\javax\inject\javax.inject\1\javax.inject-1.jar;C:\Users\user\.m2\repository\aopalliance\aopalliance\1.0\aopalliance-1.0.jar;C:\Users\user\.m2\repository\com\google\guava\guava\19.0\guava-19.0.jar;C:\Users\user\.m2\repository\org\yaml\snakeyaml\1.21\snakeyaml-1.21.jar MainKt
    1
    
    Process finished with exit code 0
