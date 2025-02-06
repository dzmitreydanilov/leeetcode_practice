package com.ddanilov

fun main() {
    val s = "abcabcbb"
    println(lengthOfLongestSubstring(s))
}
//
//abc
private fun lengthOfLongestSubstring(s: String): Int {
    val set = HashSet<Char>()
    var pointerA = 0 //3
    var pointerB = 0 //6
    var max = 0

    while (pointerB < s.length) {
        if(!set.contains(s[pointerB])) {
            set.add(s[pointerB])
            max = maxOf(set.size, max)
            pointerB++
        } else {
            println(s[pointerA])
            set.remove(s[pointerA])
            pointerA++
        }
    }

    println("set: ${set.joinToString(" ")}")
    return max
}
