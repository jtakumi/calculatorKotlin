open class Character {
    fun charSplit() {
        println("please input sentence.")
        val inputString = readLine()!!
        println(inputString.split(" ").toString())
    }
}