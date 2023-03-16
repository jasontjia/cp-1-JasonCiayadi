package com.jasontjia.kotlin.cp2

fun main() {
    val input = System.`in`.bufferedReader()
    var line = input.readLine()
    while (line != null) {
        val (n, m) = line.split(" ").map { it.toInt() }
        val result = mutableListOf<Int>()
        if (m <= 1 || n < m) {
            println("Boring!")
        } else {
            var current = n
            while (current > 1) {
                result.add(current)
                if (current % m != 0) {
                    println("Boring!")
                    break
                }
                current /= m
            }
            if (current == 1) {
                result.add(1)
                println(result.joinToString(" "))
            }
        }
        line = input.readLine()
    }
}