package s03

fun main() {
    for (dataset in 1..10) {
        val (F, D) = readLine()!!.split(" ").map { it.toInt() }

        val data = Array(D) {
            readLine()!!.split(" ").map { it.toInt() }
                }

        var count = 0

        for (dayData in data) {
            if (dayData.sum() % 13 == 0) {
                count++
                    }
                }

        for (f in 0 until F) {
            var total = 0
            for (d in 0 until D) {
                total += data[d][f]
                    }
                    if (total % 13 == 0) {
                        count++
                    }
                }

                println(count)
            }
        }
