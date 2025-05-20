package com.ddanilov.new2025.challange150

fun main() {
    val strs = arrayOf("ac","c")

    val result = groupAnagrams(strs)

    result.forEach {
        println(it)
    }
}

/**
 * "eat", "tea", "tan", "ate", "nat", "bat"
 */
private fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableMapOf<String, MutableList<String>>()
    for (s in strs) {
        val count = IntArray(26)
        s.forEach {
            count[it - 'a']++
        }
        val key = count.joinToString("#")
        result.getOrPut(key) { mutableListOf() }.add(s)
    }

    return result.values.toList()
}


private fun isAnagram(first: String, second: String): Boolean {
    if (first.length != second.length) return false

    val charArray = IntArray(26)
    for (i in 0 until first.length) {
        charArray[first[i] - 'a']++
        charArray[second[i] - 'a']--
    }

    return charArray.all { it == 0 }
}