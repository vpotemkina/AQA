//Создайте функцию maxOfTwo, которая принимает два числа в качестве
//аргументов и возвращает наибольшее число. Затем, используйте эту
//функцию для поиска максимального числа из двух разных пар чисел.

fun main() {

    var c = 0
    for (i in 1..2) {
        println("Введите первое число: ")
        var a = readln().toInt()
        println("Введите второе число: ")
        var b = readln().toInt()
        if (c == 0) {
            c = maxOfTwo(a, b)
            println("c = " + c)
        } else {
            b = maxOfTwo(a, b)
            a = c
            c = maxOfTwo(a, b)
        }
    }
    println("Большее число = " + c)
}

fun maxOfTwo(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else return b
}