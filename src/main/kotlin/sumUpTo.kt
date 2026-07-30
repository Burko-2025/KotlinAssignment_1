package org.example

fun main() {
    println("Finished Total = ${sumUpTo(10)}")
    println("Finished Total = ${sumUpTo(n = 7)}")
}

fun sumUpTo(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        val previousSum = sum
        sum += i
        println("$previousSum + $i = $sum")
    }
    return sum
}