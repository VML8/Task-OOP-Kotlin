package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    var keepOnLoopYea = true

    while (keepOnLoopYea) {
        try {
            print("Input score: ")
            val score = readLine()!!.toInt() // Ask for input here

            keepOnLoopYea = false   // Prepares for out of bound score
            val msg = when {
                score in 90..100 -> "Anda mendapatkan nilai A"
                score in 80..89 -> "Anda mendapatkan nilai B"
                score in 70..79 -> "Anda mendapatkan nilai C"
                score in 60..69 -> "Anda mendapatkan nilai D"
                score in 0..60 -> "Anda mendapatkan nilai E"
                else -> "outOfBound"

            }

            if (msg == "outOfBound") {
                println("Jarak nilai hanya 1-100")
                keepOnLoopYea = true
            } else
                println(msg)

        } catch (e: NumberFormatException) {
            println("Input yang anda masukan tidak valid, input nilai angka saja.")
        }
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
