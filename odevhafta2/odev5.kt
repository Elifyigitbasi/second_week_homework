package odevhafta2
//kotlinde Bir "Kullanici" adlı sınıf oluşturun ve ad ve soyad gibi özellikleri içeren nullable özellikler tanımlayın. Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak bu özelliklere nasıl erişebilirsiniz?
class Kullanici {
    var ad: String? = null
    var soyad: String? = null
}

fun main() {
    val kullanici = Kullanici()
    kullanici.ad = "Elif"
    kullanici.soyad = null // Soyadı null olarak atanabilir.

    // Ad ve soyad özelliklerine erişim
    println("Ad: ${kullanici.ad}")
    println("Soyad: ${kullanici.soyad}")
}