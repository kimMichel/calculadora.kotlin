class SecondNumber {
    var secondNumber: Double? = null

    @JvmName("getSecondNumber1")
    fun getSecondNumber(): Double? {
        print("Please enter your second number: ")
        val answer: String = readLine().toString()
        for (i in answer) {
            if (i in 'A'..'Z' || i in 'a'..'z') {
                return null
            }
        }
        if (answer == "" || answer == " ") {
            return null
        } else secondNumber = answer?.toDouble()
        return null
    }
}