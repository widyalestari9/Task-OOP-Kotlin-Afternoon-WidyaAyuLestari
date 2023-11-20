package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

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
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth()  : Boolean{
        if (health <= 0) {
            println("Anda telah mati $name")
            return false
        } else {
            return true
        }
    }

    fun jalan(times: Int) {
        if (checkHealth()) {
            val healthGrow = 1*times
            println("$name telah berjalan sebanyak $times kali...(health = -$healthGrow)")
            health -= healthGrow
        }
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
    fun lari(times: Int) {
        if (checkHealth()) {
            val healthGrow = 2*times
            println("$name telah berlari sebanyak $times kali...(health = -$healthGrow)")
            health -= healthGrow
        }
    }

    fun makan(times: Int) {
        if (checkHealth()) {
            val healthGrow = 2*times
            println("$name telah makan sebanyak $times kali...(health = +$healthGrow)")
            health += healthGrow
        }
    }

    fun minum(times: Int) {
        if (checkHealth()) {
            val healthGrow = 2*times
            println("$name telah minum sebanyak $times kali...(health = +$healthGrow)")
            health += healthGrow
        }
    }

    fun lompat(times: Int) {
        if (checkHealth()) {
            val healthGrow = 2*times
            println("$name telah melompat sebanyak $times kali...(health = -$healthGrow)")
            health -= healthGrow
        }
    }

    fun duduk(times: Int) {
        if (checkHealth()) {
            val healthGrow = 1*times
            println("$name telah duduk sebanyak $times kali...(health = +$healthGrow)")
            health += healthGrow
        }
    }
    
}

