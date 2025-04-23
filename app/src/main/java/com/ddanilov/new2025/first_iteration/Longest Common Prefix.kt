package com.ddanilov.new2025.first_iteration

fun main() {

    val strs = arrayOf("flower", "flow", "flight")

    val res = longestCommonPrefix(strs)

    println(res)
}

/**
 * "flower", "flow", "flight"
 *      i
 *  flow
 *   j
 *
 */
private fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = ""

    for (i in strs[0].indices) {
        for (j in 1 until strs.size) {
            val currentString = strs[j]
            if (i == currentString.length || currentString[i] != strs[0][i]) {
                return prefix
            }
        }
        prefix += strs[0][i]
    }

    return prefix
}
