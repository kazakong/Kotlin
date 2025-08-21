package s03


fun main() {
    for (dataset in 1..10) {
        val N = readLine()!!.toInt()
        val emailSet = mutableSetOf<String>()

        for (i in 1..N) {
            val email = readLine()!!
            emailSet.add(email)
            }

            println(emailSet.size)
        }
    }
