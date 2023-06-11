import java.lang.NumberFormatException

fun main() {
    println("please enter kilometers digit until decimal separator you want to convert to mile.")
    val kilo = readLine()
    if (kilo.isNullOrEmpty()) {
        println("please press enter key AFTER ENTER DIGIT.")
    }
    try {
        val inputKilo = kilo!!.toDouble()
        val kiloMile = kiloMile()
        println(kiloMile.convertKtoM(inputKilo))
    } catch (e: NumberFormatException) {
        println("would you enter digit?")
    }
    val chars = Character()
    chars.charSplit()

}
