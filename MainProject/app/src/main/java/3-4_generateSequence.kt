//Создайте рекурсивную функцию generateSequence, которая принимает целое число n и
//генерирует последовательность чисел от 1 до n. Используйте аннотацию tailrec для оптимизации.

fun main() {
    println("Введите целое число: ")
    var a = readln().toInt()
    var arr = IntArray(a)
    val pos = generateSequence(a, arr)
    println("Последовательность: ${pos.joinToString()}")
}
tailrec fun generateSequence(n: Int, arr: IntArray): IntArray {
    return if (n<1) arr else {
        arr[n - 1] = n
        generateSequence(n - 1, arr)
    }
}
