# ex1
## Eclipse
### code
      fun main()
      {
          // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
          val asc = Array(5) { i -> (i * i).toString() }
          asc.forEach { println(it) }
      }
### output
    0
    1
    4
    9
    16
