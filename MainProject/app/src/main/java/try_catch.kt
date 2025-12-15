import android.R

fun main() {
    println("Введите целое число: ")
    var input1 = readln()
    try {
        var a = input1.toInt()
    } catch (e: NumberFormatException) {
        println("Исключение поймано: $e")
    } finally {
        println("Конец программы!")
    }

    var arr = IntArray(5) {(0..100).random() }
    var k = 0
    var i = 0
    while (i <= 5) {
        i++
        try {
            k = arr[i]*2
        } catch (e: IndexOutOfBoundsException) {
            println("Исключение поймано: $e")
        }
    }


}