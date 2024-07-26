/*
1.Can you figure out the output of this code before you run it in Kotlin Playground?
Yes.

The original code 

```
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
```

will render like this:

Congratulations for your bonus! You will receive a total of 5000 + 1000 (additional bonus)

2. When you run the code in Kotlin Playground, does it print the output that you expected?
No.

The code after fix to meet your expected is as follows.
*/
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
