# ex1
## IntelliJ
### code
    enum class RGB { RED, GREEN, BLUE }
    
    fun main() {
        var begin : Long;
        var end : Long;
    
        for (color in RGB.entries)
            println(color.toString())
    
        // Same result But have poorer performance
        for (color in RGB.values())
            println(color.toString())
    
    
        begin = System.nanoTime()
        RGB.entries;
        end = System.nanoTime()
        println("It took ${end-begin} nano seconds");
    
        begin = System.nanoTime()
        RGB.values();
        end = System.nanoTime()
        println("It took ${end-begin} nano seconds");
    }
### output
    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=62747:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v2\out\production\IntelliJ_Kotlin_test_v2;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar MainKt
    RED
    GREEN
    BLUE
    RED
    GREEN
    BLUE
    It took 400 nano seconds
    It took 3900 nano seconds
    
    Process finished with exit code 0
