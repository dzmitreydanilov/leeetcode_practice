package com.ddanilov.new2025.first_iteration

fun main() {
    val s = "abcabcbb"

    val result = lengthOfLongestSubstring(s)

    println("XXXX $result")
}


/**
 * abcabcbb
 *     l
 *        r
 *
 * []
 *
 * max = 3
 */

private fun lengthOfLongestSubstring(s: String): Int {
    val charsSet = mutableSetOf<Char>()
    var max = 0

    var (l, r) = 0 to 0

    while (r < s.length) {
        if (!charsSet.contains(s[r])) {
            charsSet.add(s[r])
            max = maxOf(max, charsSet.size)
            r++
        } else {
            charsSet.remove(s[r])
            l++
        }
    }

    return max
}
