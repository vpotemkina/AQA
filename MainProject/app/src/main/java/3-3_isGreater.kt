//Создайте инфиксную функцию isGreater , которая принимает два числа и возвращает true,
//если первое число больше второго, и false в противном случае. Затем используйте
//эту функцию, сравнив две пары чисел.

fun main() {
    for (i in 1..2) {
        println("Введите первое число: ")
        var a = readln().toInt()
        println("Введите второе число: ")
        var b = readln().toInt()
        val result = a isGreater b
        println("Первое число больше второго - " + result)
    }
}
infix fun Int.isGreater(other: Int): Boolean {
    if (this > other) {
        return true
    } else {
        return false
    }
}



