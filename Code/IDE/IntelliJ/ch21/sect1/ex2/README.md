# ex2
## IntelliJ
### code
    import java.util.*
    
    // Library code
    @RequiresOptIn(message = "This API is experimental. It may be changed in the future without notice.")
    @Retention(AnnotationRetention.BINARY)
    @Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
    annotation class MyDateTime // Opt-in requirement annotation
    
    @MyDateTime
    class DateProvider // A class requiring opt-in
    
    // Client code
    fun getYear(): Int {
        val dateProvider: DateProvider // Error: DateProvider requires opt-in
        // ...
    }
    
    @MyDateTime
    fun getDate(): Date {
        val dateProvider: DateProvider // OK: the function requires opt-in as well
        // ...
    }
    
    fun displayDate() {
        println(getDate()) // Error: getDate() requires opt-in
    }
    
    fun main()
    {
    
    }
### output
Compiler Error.

    C:\Users\user\IdeaProjects\IntelliJ_Kotlin_test_v3\src\main\kotlin\Main.kt:14:23
    Kotlin: This API is experimental. It may be changed in the future without notice.

![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/bf0cabed-efa8-443e-b2a3-8074d684b893)
