package com.ddanilov.newchallange

fun main() {
    val strs = arrayOf("flower", "flow", "flight")

    val result = longestCommonPrefix(strs)

    println(result)
}

private fun longestCommonPrefix(strs: Array<String>): String {
    val word = strs[0]
    var result = ""

    for (i in word.indices) {
        for (s in strs) {
            if (i == s.length || s[i] != word[i]) {
                return result
            }
        }
        result += word[i]
    }

    return result
}