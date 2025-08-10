fun main() {
    val telenumber = readLine()!!


    if (telenumber.length == 4 && telenumber.all { it.isDigit() }) {
        val firstDigit = telenumber[0]
        val secondDigit = telenumber[1]
        val thirdDigit = telenumber[2]
        val lastDigit = telenumber[3]


        if ((firstDigit == '8' || firstDigit == '9') && secondDigit == thirdDigit && (lastDigit == '8' || lastDigit == '9')) {
            println(telenumber)
        } else {
            println("ignore")
        }
    } else {
        println("answer")
    }
}
