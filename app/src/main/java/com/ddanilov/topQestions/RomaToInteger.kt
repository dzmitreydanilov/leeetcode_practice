package com.ddanilov.topQestions

fun main() {
    val s = "LVIII"

    println(romanToInt(s))
}

private fun romanToInt(s: String) : Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0

    for(i in s.indices) {
        if(i < s.length - 1 && map[s[i]]!! < map[s[i + 1]]!!) {
            result -= map[s[i]]!!
        } else {
            result += map[s[i]]!!
        }
    }

    return  result
}
