package id.infinitelearning.KotlinSubmission.exercise1

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
    var firstName: String = "Widya"
    var lastName: String = "Lestari"
    var age: Int = 21
    var status: Boolean = true;


    println(firstName)
    println(lastName)
    println(age)
    println(status)
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    var groupId = "Celestial"
    var groupMember = listOf("Widya","Revangga","Bestran","Andika","Hasyim")
    var session = "Siang"

    println("=====Anggota Group Saya=====")
    println("Group ID = $groupId")
    println("Anggota Group = $groupMember")
    println("Sesi = $session")

    return Any()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val celestial = listOf("Widya","Revangga","Bestran","Andika","Hasyim","Alan","Surya","Cherlin","Taufiq","Halena","Arya")
    return listOf(celestial[1])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Raihan", "Fateh")
    val countOfGroup = arrayOf("Widya Ayu Lestari","Bestran Antony Hutabarat","Muhammad Hasyim","Revangga Prakusya Damanik", "Andika Risky Faiztama")

    return mentor.size + countOfGroup.size
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
    groupDetail("Celestial", listOf("Widya Ayu Lestari","Bestran Antony Hutabarat",
        "Muhammad Hasyim","Revangga Prakusya Damanik", "Andika Risky Faiztama"), " Afternoon A")

}