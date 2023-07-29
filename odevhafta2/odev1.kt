package odevhafta2

open class GeometrikSekil {

}

class Dikdortgen(val uzunluk: Double, val genislik: Double) : GeometrikSekil() {

    fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}

class Daire(val yaricap: Double) : GeometrikSekil() {

    fun alanHesapla(): Double {
        val pi = 3.14
        return pi * yaricap * yaricap
    }

    fun cevreHesapla(): Double {
        val pi = 3.14
        return 2 * pi * yaricap
    }
}

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    println("Dikdörtgen Alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgen Çevresi: ${dikdortgen.cevreHesapla()}")

    val daire = Daire(4.0)
    println("Daire Alanı: ${daire.alanHesapla()}")
    println("Daire Çevresi: ${daire.cevreHesapla()}")
}