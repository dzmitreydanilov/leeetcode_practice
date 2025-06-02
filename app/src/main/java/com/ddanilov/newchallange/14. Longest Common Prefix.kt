package com.ddanilov.newchallange

fun main() {
    val string = arrayOf("flower", "flow", "flight")
    val result = longestCommonPrefix(string)

    print(result)
}

private fun longestCommonPrefix(strs: Array<String>): String {
    val shortestWord = strs.minBy { it.length }

    for (i in shortestWord.indices) {

        val char = shortestWord[i]

        for (word in strs) {
            if (word[i] != char) {
                return shortestWord.substring(0, i)
            }
        }
    }

    return shortestWord
}