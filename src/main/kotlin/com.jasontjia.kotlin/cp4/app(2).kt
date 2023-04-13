package com.jasontjia.kotlin.cp4
fun main() {
    val t = readLine()!!.toInt()
    val result = StringBuilder()
    repeat(t) {
        val n = readLine()!!
        val b1 = n.toInt().toString(2).count { it == '1' }
        val b2 = n.toInt(16).toString(2).count { it == '1' }
        result.append("$b1 $b2\n")
    }
    println(result.toString())
}
