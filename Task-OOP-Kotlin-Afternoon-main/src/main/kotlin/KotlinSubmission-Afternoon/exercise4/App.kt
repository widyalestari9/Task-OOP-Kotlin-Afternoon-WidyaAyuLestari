package id.infinitelearning.KotlinSubmission.exercise4

import javax.xml.bind.ValidationException

fun main() {

    try{
        validate("Widya")
        validate("")
    }catch (error: ValidationException){
        println("Terjadi Error ${error}")
    }

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


fun validate(name: String){
    if (name.isBlank()){
        throw ValidationException("Name is blank")
    } else{
        println("Hello $name ")
    }
}