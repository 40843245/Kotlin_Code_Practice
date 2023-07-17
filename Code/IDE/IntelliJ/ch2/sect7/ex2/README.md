# ex2
## IntelliJ
### code
    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }
    fun main()
    {
        println(Color.RED)
        println(Color.GREEN)
        println(Color.BLUE)
    }
### output
    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=65416:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v2\out\production\IntelliJ_Kotlin_test_v2;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar MainKt
    RED
    GREEN
    BLUE
    
    Process finished with exit code 0
