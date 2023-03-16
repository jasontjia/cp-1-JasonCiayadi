package com.jasontjia.kotlin.cp2

fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        var sum = 0
        for (i in a..b) {
            if (i % 2 == 1) {
                sum += i
            }
        }
        println("Case ${it+1}: $sum")
    }
}

