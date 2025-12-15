fun main() {
    var arr1 = IntArray(20) { (-20..20).random() }

    println("Массив:")
    var i = 0
    while (i < 20) {
        var k = arr1[i]
        print("arr[" + i + "] = " + k + " ,")
        i++
    }
    println()
    println("Первый вариант: ")
    sum1(arr1)
    println("Второй вариант: " + sum2(arr1))

    println("Пропустить числа 3 и 7: ")
    for (i in 1..10) {
        if (i == 3 || i == 7) {
            continue
        }
        println(i)
    }
}

//Первый вариант - накопление сумм в массив
fun sum1(arr: IntArray): IntArray {
    val arr2 = mutableListOf<Int>()
    val j = arr.size - 1
    var s = 0
    for (i in (0..j)) {
        if (arr[i] > 10) {
            for (k in (1..j)) {
                if (arr[k] > 10 && i != k) {
                    s = arr[i] + arr[k]
                    println("arr[" + i + "] = " + arr[i] + ", arr[ " + k + "] = " + arr[k] + ", sum = " + s)
                    arr2.add(s)
                }
                else {
                    if (arr[i] < 0) {
                        println("Стоп: число меньше 0!")
                        return arr2.toIntArray()
                        break
                    }
                }
            }
        }
        else {
            if (arr[i] < 0) {
                println("Стоп: число меньше 0!")
                return arr2.toIntArray()
                break
            }
        }
    }
    return arr2.toIntArray()
}

//Второй вариант - перезапись суммы
fun sum2(arr: IntArray): Int {
    val j = arr.size - 1
    var s = 0
    for (i in (0..j)) {
        if (arr[i] > 10) {
            for (k in (1..j)) {
                if (arr[k] > 10 && i != k) {
                    s = arr[i] + arr[k]
                } else {
                    if (arr[i] < 0) {
                        return s
                        break
                    }
                }
            }
        } else {
            if (arr[i] < 0) {
                return s
                break
            }
        }
    }
    return s
}
