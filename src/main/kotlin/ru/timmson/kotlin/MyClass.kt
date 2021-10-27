package ru.timmson.kotlin


fun main(args: Array<String>) {

    val numbers = arrayOf(1, 3, 2, 3)
    val sum = numbers.fold(0, Int::plus)

    println("Hello, World! - $sum")

    val e = Employee.of("1", "1")
}

