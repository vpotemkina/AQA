// Введение в Kotlin

var a = "First line";
var b: Char = 'B';
var c = 100;
val Pi: Float = 3.14F;
var d: Int = 123;
var e = 23.234F;
var f = true;
val g: Boolean = false;

/* Основная практическая часть
внутри функции */

/**
 * Это важная задокументированная часть о работе моей функции
 */

fun main() {
    println("Hello, World!")
    println("a = " + a)
    println("b + c = " + b + c)
    println("Pi = " + Pi)
    println("e = " + e)
    println("Boolean type: " + f + ", " + g)
    c = c * 5
    b = 'X'
    println("b + c = " + b + c)
    val isEqual = Pi == e
    println("isEqual = " + isEqual)
    val Num1 = (Pi < c) && (Pi != e)
    println("Num1 = " + Num1)
    val Num2 = (e > Pi) || (isEqual == Num1)
    println("Num2 = " + Num2)
    val Num3 = (e > Pi) && (isEqual == Num1)
    println("Num3 = " + Num3)
    a += a
    println("a = " + a)
    var h = e / Pi
    println("h = " + h)
    h = e % Pi
    println("h = " + h)
    val Num4 = !(Num1 == Num2)
    println("Num4 = " + Num4)
}

