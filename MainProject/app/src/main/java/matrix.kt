fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15),
        arrayOf(16, 17, 18, 19, 20),
        arrayOf(21, 22, 23, 24, 25)
    )

    println("Введите целевое число: ")
    var input1 = readln()
    var a = input1.toInt()

    first@ for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] == a) {
                println("Элемент матрицы [" + i + "][" + j + "]")
                break@first
            }
            if (i == (matrix.size - 1) && j == (matrix[0].size - 1)) {
                println("Число не найдено")
                break
            }
        }
    }



}
