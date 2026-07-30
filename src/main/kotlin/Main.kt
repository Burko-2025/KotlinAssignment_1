package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {



    println("Finished Total sumUpTo(10) = ${sumUpTo(10)}")
    println("Finished Total sumUpTo(10) = ${sumUpTo(5)}")
    println("Finished Total Iterative(5) = ${factorial(5)}")
    println("Finished Total Iterative(7) = ${factorial(7)}")
    var factorialLambda = { n: Int ->
        var result = 1L

        for (i in 1..n) {
            result *= i
            println("$i! = $result")
        }

        result
    }

    var factorialResult = factorialLambda(5)
    println("Finished Total Lambda(5) = ${factorialResult}")
    factorialLambda = { n ->
        var result = 1L

        for (i in 1..n) {

            result *= i

            println("$i! = $result")
        }

        result
    }

    var factorialResult2 = factorialLambda(7)
    println("Finished Total Lambda(7) = ${factorialResult2}")
    println("Finished Total Recursive(5) = ${factorial2(5)}")
    println("Finished Total Recursive(7)= ${factorial2(7)}")
}