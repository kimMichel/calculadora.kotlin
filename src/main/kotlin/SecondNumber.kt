class SecondNumber {
    var secondNumber: Double? = null

    @JvmName("getSecondNumber1")
    fun getSecondNumber() {
        print("Please type your second number: ")
        secondNumber = readLine()?.toDouble()
    }
}