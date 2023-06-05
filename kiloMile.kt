open class kiloMile {
    fun convertKtoM(kilo: Double) {
        val mile = kilo / 1.60934
        println("converted kilometers to mile: $mile mp")
    }

    fun convertMtoK(mile: Double) {
        val kilo = mile * 1.60934
        println("converted mile points to kilometers: $kilo km")
    }
}
