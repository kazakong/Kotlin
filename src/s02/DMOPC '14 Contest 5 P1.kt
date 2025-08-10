package s02

class `DMOPC '14 Contest 5 P1`

            fun main() {
            val PI = 3.14159
            val r = readLine()!!.toInt()
            val h = readLine()!!.toInt()  // 높이 입력 받기
            // 원뿔 부피 계산 공식
            val v = (PI * r * r * h) / 3

            // 부피 출력
            println(v)
        }



