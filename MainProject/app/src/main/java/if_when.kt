
fun main() {
    println("Введите целое число: ")
    var input1 = readln()
    var a = input1.toInt()
    if (a is Int) {
        if (a > 0) {
            println("Вы ввели положительное число.")
        }
        else if (a < 0) {
            println("Вы ввели отрицательное число.")
        }
        else {
            println("Вы ввели ноль.")
        }
    }
    println("Введите еще одно число: ")
    var input = readln()
    var b = input.toFloat()
    val d = b.toInt()
    var c = b - d
    when {
        c == 0f -> println("Вы ввели целое число.")
        else -> println("Вы ввели десятичное число.")
    }
    when {
        b > 0f -> println("Вы ввели положительное число.")
        b < 0f -> println("Вы ввели отрицательное число.")
        b == 0f -> println("Вы ввели ноль.")
    }
}