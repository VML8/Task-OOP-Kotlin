package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    hero.setProfile("Luqmannul Hakim", 20, 165)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()

    /**
    Challenge:
    ===============Class A Afternoon===============
    4Keys -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x */

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    // Default stamina = 20
    hero.jalan()    // -1
    hero.lari()     // -2
    hero.lompat()   // -2
    hero.jalan()    // -1
    hero.jalan()    // -1 = 20-7 = 13
    // 3 jalan, 1 lari, 1 lompat

    // Istirahat sejenak
    hero.duduk()    // +1
    hero.minum()    // +2 = 13+3 = 16
    // 1 duduk (done), 1 minum (done)

    // Round 2
    hero.jalan()    // -1
    hero.lari()     // -2
    hero.lompat()   // -2
    hero.makan()    // +2 = 16-3 = 13
    // 1 jalan (total 4), 1 lari (done), 1 makan, 1 lompat.

    // Remaining action are 1 jalan, 2 makan, 1 lompat
    // Final Round
    hero.lompat()   // -2
    hero.jalan()    // -1
    hero.makan()    // +2
    hero.makan()    // +2 = 13+(4-3) = 14

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.profile()


}