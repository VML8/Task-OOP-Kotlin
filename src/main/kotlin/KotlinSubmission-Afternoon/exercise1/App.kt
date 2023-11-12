package `KotlinSubmission-Afternoon`.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val first_name = "Luqmannul" // was going to use 'firstName' as val name but was taken by kotlin?
    val last_name = "Hakim" // for consistency, will use snake case for the entire of this file
    val age = 20
    val is_not_married = true

    println("First Name: $first_name")
    println("Last Name: $last_name")
    println("Age: $age")
    if (is_not_married) {
        println("Status : Single")
    } else {
        println("Status : Married")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Anggota Kelompok :")
    println("Sesi: $session")
    for (item in groupMember) println("- $item")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    // Warning: Local variable used once can be inlined, so I did it *shrugie*
    return listOf(
        "Siljinia Heidi Pedati",
        "Delviya Indra Gani",
        "Muhammad Naufal Rizky",
        "Alexander Caisar Simamora",
        "Aisyah Tsuraya Rafilah",
        "Muhammad Azmi",
        "Bilsyakur Akmeison",
        "Muhammad Ilham",
        "Luqmannul Hakim",
        "Jamila Ulfiah",
        "Yusuf Abiyyu Rahman"
    )
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Raihan", "Kak Fatih")
    val countOfGroup = arrayOf<String>(
        "Siljinia Heidi Pedati",
        "Delviya Indra Gani",
        "Muhammad Naufal Rizky",
        "Alexander Caisar Simamora",
        "Aisyah Tsuraya Rafilah",
        "Muhammad Azmi",
        "Bilsyakur Akmeison",
        "Muhammad Ilham",
        "Luqmannul Hakim",
        "Jamila Ulfiah",
        "Yusuf Abiyyu Rahman"
    )

    return mentor.count() + countOfGroup.count()
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(
        "4Keys",
        listOf("Siljinia Heidi Pedati",
            "Delviya Indra Gani",
            "Muhammad Naufal Rizky",
            "Alexander Caisar Simamora",
            "Aisyah Tsuraya Rafilah",
            "Muhammad Azmi",
            "Bilsyakur Akmeison",
            "Muhammad Ilham",
            "Luqmannul Hakim",
            "Jamila Ulfiah",
            "Yusuf Abiyyu Rahman"),
        "Siang")

}