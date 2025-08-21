package s03

package s03

fun main() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val input = readLine()!!.split(" ")
        val m = input[0].toInt()
        val k = input[1].toInt()

        val counts = mutableMapOf<String, Int>()

        var j = 0
        while (j < m) {
            val word = readLine()!!
            if (counts.containsKey(word)) {
                counts[word] = counts[word]!! + 1
            } else {
                counts[word] = 1
            }
            j++
        }

        val freqMap = mutableMapOf<Int, MutableList<String>>()
        for ((word, count) in counts) {
            if (!freqMap.containsKey(count)) {
                freqMap[count] = mutableListOf()
            }
            freqMap[count]!!.add(word)
        }

        val sortedFreq = freqMap.keys.sortedDescending()

        println("${k}th most common word:")

        if (k <= sortedFreq.size) {
            val freq = sortedFreq[k - 1]
            val words = freqMap[freq]!!
            for (w in words) {
                println(w)
            }
        }

        println()
    }
}
