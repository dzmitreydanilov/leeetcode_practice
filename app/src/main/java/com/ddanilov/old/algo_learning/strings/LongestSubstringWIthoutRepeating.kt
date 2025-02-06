package com.ddanilov.algo_learning.strings

fun main() {
    val string = "abcabcbb"
    val result = lengthOfLongestSubstring(string)

    println(result)
}

private fun lengthOfLongestSubstring(s: String): Int {
    val set = HashSet<Char>()
    var pointerA = 0
    var pointerB = 0
    var max = 0
    while (pointerB < s.length)
        if (!set.contains(s[pointerB])) {
            set.add(s[pointerB])
            pointerB++
            max = maxOf(set.size, max)
        } else {
            set.remove(s[pointerA])
            pointerA++
        }

    return max
}
