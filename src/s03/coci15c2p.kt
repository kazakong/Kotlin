package s03
fun main(){
        val n = readLine()!!.toInt()
        val words = mutableListOf<String>()

        for (i in 1..n) {
            val word = readLine()!!
            words.add(word)
        }

        val s = readLine()!!

        val keys = s.toSet()

        var count = 0
        for (word in words) {
            val canMake = word.all { ch -> ch in keys }
            if (canMake) {
                count++
            }
        }

        println(count)
    }
