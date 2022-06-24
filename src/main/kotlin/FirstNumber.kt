class FirstNumber {
    var firstNumber: Double? = null

    @JvmName("getFirstNumber1")
    fun getFirstNumber(): Double? {
        print("Please enter your first number: ")
        val answer: String = readLine().toString()
        for (i in answer) {
            if (i in 'A'..'Z' || i in 'a'..'z') {
                return null
            }
        }
        if (answer == "" || answer == " ") {
            return null
        } else firstNumber = answer?.toDouble()

        return null
    }
}


