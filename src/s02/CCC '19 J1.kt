package s02

fun main() {

    val Applethree = readLine()!!.toInt()*3
    val Appletwo = readLine()!!.toInt() *2
    val Appleone = readLine()!!.toInt() *1
    val Bananathree = readLine()!!.toInt()*3
    val Bananatwo = readLine()!!.toInt()*2
    val Bananaone = readLine()!!.toInt()*1
    val scoreA = ( Applethree + Appletwo +  Appleone)
    val scoreB = (Bananathree +  Bananatwo +  Bananaone)

    if (scoreA > scoreB) {
        println('A')
    } else if (scoreB > scoreA) {
        println('B')
    } else {
        println('T')
    }
}




