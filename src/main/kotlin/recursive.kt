package org.example

fun main() {
    println("Finished Total = ${factorial2(5)}")
    println("Finished Total = ${factorial2(7)}")
}

fun factorial2(n: Int): Long {
    // Base case
    if (n == 1) {
        return 1
    }

    // Recursive case
    return n * factorial2(n - 1)
}