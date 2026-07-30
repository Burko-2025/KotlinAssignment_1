package org.example

fun main() {
    println("Finished Total = ${factorial(5)}")
    println("Finished Total = ${factorial(7)}")
}

fun factorial(n: Int): Long {
    var result = 1L

    for (i in 1..n) {
        val previous = result
        result *= i

        println("$previous * $i = $result")
    }

    return result
}