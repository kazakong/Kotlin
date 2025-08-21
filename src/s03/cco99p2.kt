package s03

fun main() {

    val testCaseCount = readLine()!!.toInt()

    for (test in 1..testCaseCount) {
        val line = readLine()!!.split(" ")
        val m = line[0].toInt()
        val k = line[1].toInt()

        val wordCounts = mutableMapOf<String, Int>()

        for (i in 1..m) {
            val word = readLine()!!
            if (wordCounts.containsKey(word)) {
                wordCounts[word] = wordCounts[word]!! + 1
            } else {
                wordCounts[word] = 1
            }
        }

        val sortedList = wordCounts.entries
            .sortedByDescending { it.value } // 값 기준 내림차순 정렬

        val freqList = mutableListOf<Int>()
        for (entry in sortedList) {
            if (!freqList.contains(entry.value)) {
                freqList.add(entry.value)
            }
        }

        println("${k}번째로 많이 나온 단어:")

        if (k <= freqList.size) {
            val targetCount = freqList[k - 1]
            for ((word, count) in sortedList) {
                if (count == targetCount) {
                    println(word)
                }
            }
        } else {
            println("해당 순위는 없습니다.")
        }

        println()
    }
}
