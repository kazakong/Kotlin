package s02

fun main () {

    val x = readLine()!!.toInt()
    val n = readLine()!!.toInt()


    var used = 0
    repeat(n) {
        used += readLine()!!.toInt()
    }
    val result = x *(n+1) - used
    println(result)


}
