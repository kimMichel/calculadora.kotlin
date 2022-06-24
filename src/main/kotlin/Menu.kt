class Menu {

    var option: Int? = 0

    fun menu() {
        println("-------------------")
        println("OPERATION:")
        println("1 - ADDITION ")
        println("2 - SUBTRACTION")
        println("3 - MULTIPLICATION")
        println("4 - DIVISION")
        print("Please Select the operation: ")
    }

    fun getOperation() {
        while (option !in (1..4)) {
            option = readLine()?.toInt()
            if (option !in (1..4)) print("PLEASE TYPE A VALID OPERATION: ")
        }
    }
}