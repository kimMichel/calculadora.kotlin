fun main(args: Array<String>) {
    println("Welcome to Calculator!")

    val num1 = FirstNumber()
    val num2 = SecondNumber()
    val menu = Menu()
    val operation = Operation()

    num1.getFirstNumber()
    num2.getSecondNumber()
    menu.menu()
    menu.getOperation()

    val firstNumber: Double? = num1.firstNumber
    val secondNumber: Double? = num2.secondNumber
    var option: Int? = menu.option

    if (firstNumber != null) {
        if (secondNumber != null) {
            if (option != null) {
                operation.operation(firstNumber, secondNumber, option)
            }
        } else errorMessage()
    } else errorMessage()

}

fun errorMessage() {
   println("THE NUMBERS CANNOT BE A NULL VALUE. PLEASE ENTER A VALID NUMBER.")
}