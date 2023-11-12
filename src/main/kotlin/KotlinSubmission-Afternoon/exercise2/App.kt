package id.infinitelearning.KotlinSubmission.exercise2

import java.time.LocalDate

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val evenNumber = mutableListOf<Int>()   // Declaration

    for (i in 1..100) {
        if (i %2 == 0) {                    // Even number check
            evenNumber.add(i)
        }
    }


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst... */ // Close this pls thanks
    // Buat di bawah sini

    val monthMap = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    /**
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst... */ // Close this pls thanks
    // Buat di bawah sini

    monthMap.forEach { (key, value) -> println("$key -> $value")
    }

    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

    // For this I'm going to import LocalDate hihihi...
    val localMonthNow = LocalDate.now().month // Feeling fancy!
    val monthNow = localMonthNow.toString().lowercase().capitalize() // Depracated but shorter lulw
    val birthMonth = monthMap["Aug"] // Used previous map variable

    println("It's $monthNow now, I was born in $birthMonth") // keep it as it is

}