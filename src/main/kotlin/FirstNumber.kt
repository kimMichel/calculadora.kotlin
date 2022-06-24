class FirstNumber {
    var firstNumber: Double? = null

    @JvmName("getFirstNumber1")
    fun getFirstNumber() {
        print("Please type your first number: ")
        firstNumber = readLine()?.toDouble()
    }
}