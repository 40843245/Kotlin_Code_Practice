# ex1
## ideone
### code
    class Rectangle(val width: Int, val height: Int) {
        val area: Int // property type is optional since it can be inferred from the getter's return type
            get() = this.width * this.height
    }
    fun main() {
        val rectangle = Rectangle(3, 4)
        println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")
    }
### output
    Width=3, height=4, area=12
    
