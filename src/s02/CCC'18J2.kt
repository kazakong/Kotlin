package s02

fun main(){

    val n = readLine()!!.toInt()
    val yesterday = readLine()!!
    val today = readLine()!!

    var count = 0
    for (i in 0 until n) {
        if (yesterday[i] == 'C'&& today[i] == 'C') {
            count++

        }
    }
    println(count)

}