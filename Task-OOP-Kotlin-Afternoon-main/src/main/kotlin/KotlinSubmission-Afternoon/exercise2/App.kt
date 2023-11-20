package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

    println("==LIST BILANGAN GENAP==")
    val bilanganGenap = mutableListOf<Int>()
    var index= 0

    for (i in 1..100) {
        if (i%2 == 0) {
            bilanganGenap.add(index++, i)
        }
    }
    println(bilanganGenap)




    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini

    val map: Map <String> = mapOf(
        Pair("Jan","January"),
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nove" to "November",
        "Dec" to "December"
    )
    for((key, value) in map){
        println("$key to $value")
    }

    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
//    - Dst...

    println("\n===MONTHS===")
    months.forEach { entry ->
    println("${entry.key} -> ${entry.value}")
    }

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"

    // Buat di bawah sini


    println("\nIt's ${months.get("Nov")}, I was born in ${months.get("Apr")}")


}