package odevhafta2

open class Oyuncu(val ad: String) {
    open fun oyna() {
        println("$ad oynuyor.")
    }
}

class Futbolcu(ad: String) : Oyuncu(ad) {
    override fun oyna() {
        println("$ad futbol oynuyor.")
    }
}

class Basketbolcu(ad: String) : Oyuncu(ad) {
    override fun oyna() {
        println("$ad basketbol oynuyor.")
    }
}

fun main() {
    val futbolcu1 = Futbolcu("Alex")
    val basketbolcu1 = Basketbolcu("Ali")

    futbolcu1.oyna()
    basketbolcu1.oyna()
}