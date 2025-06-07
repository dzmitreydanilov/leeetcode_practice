package com.ddanilov.newchallange

fun main() {

    val strs = arrayOf("flower", "flow", "flight")

    val result = longestCommonPrefix(strs)

    print(result)

}

/**
 *
 */
private fun longestCommonPrefix(strs: Array<String>): String {
    var result = ""
    val first = strs[0]
    for (i in first.indices) {
        for (s in strs) {
            if (i == s.length || s[i] != first[i]) {
                return result
            }
        }
        result += first[i]
    }

    return result
}