package com.ddanilov.newprofile

fun main() {
    val s = "abcabcbb"
    println(lengthOfLongestSubstring(s))
}

private fun lengthOfLongestSubstring(s: String): Int {
    val charSet = HashSet<Char>()
    var aPointer = 0
    var bPointer = 0
    var max = 0

    while (bPointer < s.length) {
        if (!charSet.contains(s[bPointer])) {
            charSet.add(s[bPointer])
            bPointer++
            max = maxOf(charSet.size, max)
        } else {
            charSet.remove(s[aPointer])
            aPointer++
        }
    }
    return max
}
