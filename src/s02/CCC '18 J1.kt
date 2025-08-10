fun main() {
    val telenumber = readLine()!!

    // 4자리 숫자인지 확인
    if (telenumber.length == 4 && telenumber.all { it.isDigit() }) {
        val firstDigit = telenumber[0]  // 첫 번째 자릿수
        val secondDigit = telenumber[1] // 두 번째 자릿수
        val thirdDigit = telenumber[2]  // 세 번째 자릿수
        val lastDigit = telenumber[3]   // 네 번째 자릿수

        // 텔레마케터 번호 패턴 체크
        if ((firstDigit == '8' || firstDigit == '9') && secondDigit == thirdDigit && (lastDigit == '8' || lastDigit == '9')) {
            println(telenumber)  // 텔레마케터 번호 출력
        } else {
            println("ignore")  // 텔레마케터 번호가 아니면 "ignore" 출력
        }
    } else {
        println("answer")  // 4자리가 아니면 "answer"
    }
}
