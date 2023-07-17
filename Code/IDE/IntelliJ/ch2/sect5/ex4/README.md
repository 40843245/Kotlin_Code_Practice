# ex4
## IntelliJ
### code
    interface Factory<T> {
        fun create(): T
    }
    
    class MyClass {
        init {
            println("MyClass")
        }
        companion object : Factory<MyClass> {
            override fun create(): MyClass = MyClass()
        }
    }
    
    fun main()
    {
        val f: Factory<MyClass> = MyClass
        val x = f.create()
    }
### output
    C:\Users\user\.jdks\corretto-20.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\lib\idea_rt.jar=57602:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v2\out\production\IntelliJ_Kotlin_test_v2;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk8\1.9.0\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.9.0\kotlin-stdlib-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-common\1.9.0\kotlin-stdlib-common-1.9.0.jar;C:\Users\user\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar;C:\Users\user\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib-jdk7\1.9.0\kotlin-stdlib-jdk7-1.9.0.jar MainKt
    MyClass
    
    Process finished with exit code 0
