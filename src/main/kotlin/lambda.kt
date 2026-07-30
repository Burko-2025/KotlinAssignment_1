package org.example

fun main() {


    // Long-hand version
    var factorialLambda = { n: Int ->
        var result = 1L

        for (i in 1..n) {
            result *= i
            println("$i! = $result")
        }

        result
    }

    var factorialResult = factorialLambda(5)
    println("Finished Total = $factorialResult")

    // Short-hand version
    factorialLambda = { n ->
        var result = 1L

        for (i in 1..n) {

            result *= i

            println("$i! = $result")
        }

        result
    }

    var factorialResult2 = factorialLambda(7)
    println("Finished Total = $factorialResult2")
}

