package com.jasontjia.kotlin.cp3

import java.util.*
data class Number(val value: Int, val mod: Int) : Comparable<Number> {
    override fun compareTo(other: Number): Int {
        return when {
            mod != other.mod -> mod - other.mod
            value % 2 != 0 && other.value % 2 == 0 -> -1
            value % 2 == 0 && other.value % 2 != 0 -> 1
            value % 2 != 0 && other.value % 2 != 0 -> other.value - value
            else -> value - other.value
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        val n = scanner.nextInt()
        val m = scanner.nextInt()
        if (n == 0 && m == 0) break
        println("$n $m")
        val numbers = mutableListOf<Number>()
        for (i in 0 until n) {
            val x = scanner.nextInt()
            numbers.add(Number(x, x % m))
        }
        numbers.sort()
        for (number in numbers) {
            println(number.value)
        }
    }
}