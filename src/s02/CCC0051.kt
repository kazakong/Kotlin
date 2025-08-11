package s02

fun main () {
    var coins = readLine()!!.toInt()
    var machine = readLine()!!.toInt()
    var machine2 = readLine()!!.toInt()
    var machine3 = readLine()!!.toInt()

    var plays = 0

    while (coins > 0) {


        coins--;machine++;plays++
        if (machine == 35) {
            coins += 30
            machine = 0
            if (coins == 0) break
        }
        coins--;machine2++;plays++
        if (machine2 == 100) {
            coins += 60
            machine2 = 0
            if (coins == 0) break
        }
        coins--;machine3++;plays++
        if (machine3 == 10) {
            coins += 9
            machine3 = 0
        }

    }
    println("martha plays $plays time before going broke")
}
