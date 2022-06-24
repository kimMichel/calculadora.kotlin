class Operation {
    fun operation(num1: Double, num2: Double, operator: Int) {
        when(operator) {
            1 -> addition(num1, num2)
            2 -> subtraction(num1, num2)
            3 -> multiplication(num1, num2)
            4 -> division(num1, num2)
        }
    }

    fun addition(num1: Double, num2: Double) {
        println("The sum of the numbers $num1 and $num2 is: ${num1 + num2}")
    }

    fun subtraction(num1: Double, num2: Double) {
        println("The subtraction of the numbers $num1 and $num2 is: ${num1 - num2}")
    }

    fun multiplication(num1: Double, num2: Double) {
        println("The multiplication of the numbers $num1 and $num2 is: ${num1 * num2}")
    }

    fun division(num1: Double, num2: Double) {
        println("The division of the numbers $num1 and $num2 is: ${num1 / num2}")
    }

}