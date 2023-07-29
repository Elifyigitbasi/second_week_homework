package odevhafta2

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    fun maasArttir(oran: Double) {
        maas *= (1 + oran)
    }
}

fun main() {
    val personel1 = Personel("Elif", "Yiğitbaşı", "Mühendis", 9000.0)
    val personel2 = Personel("Ayşe", "Yılmaz", "Yönetici", 8000.0)

    println("Personel 1: ${personel1.ad} ${personel1.soyad}, ${personel1.pozisyon}, Maaş: ${personel1.maas}")
    println("Personel 2: ${personel2.ad} ${personel2.soyad}, ${personel2.pozisyon}, Maaş: ${personel2.maas}")

    personel1.maasArttir(0.1) // %10 zam yapalım
    personel2.maasArttir(0.15) // %15 zam yapalım

    println("Zam Sonrası - Personel 1 Maaşı: ${personel1.maas}")
    println("Zam Sonrası - Personel 2 Maaşı: ${personel2.maas}")
}