package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var stamina = 20 // Changed to stamina becoz it's not a fighting scenario.

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("stamina: $stamina")
        println("===========================")
    }

    private fun checkHealth() {
        if (stamina <= 0) {
            println("$name telah pingsan.")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        stamina -= 1
    }

    fun lari() {
        checkHealth()
        println("$name berlari!!!")
        stamina -= 2
    }

    fun lompat() {
        checkHealth()
        println("$name melakukan sebuah lompatan...")
        stamina -= 2
    }

    fun duduk() {
        checkHealth()
        println("$name duduk untuk beristirahat sejenak...")
        stamina += 1
    }

    fun makan() {
        checkHealth()
        println("$name makan untuk memulihkan tenaga.")
        stamina += 2
    }

    fun minum() {
        checkHealth()
        println("$name minum untuk mengembalikan cairan tubuh.")
        stamina += 2
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
}