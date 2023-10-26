package com.ddanilov.algo_learning.strings

import java.util.Arrays

fun main() {
    val wordsArray = arrayOf("flox", "flow", "flower", "floghttesdas")
    val result = longestCommonPrefix1(wordsArray)

    println(result)
}

// TC O(n)
// SC O(n)
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

// TC O(nlogn)
// SC O(1)
private fun longestCommonPrefix1(strs: Array<String>): String {
    Arrays.sort(strs)
    var indexControl = 0
    val first = strs[0]
    val last = strs[strs.size - 1]
    while (indexControl < first.length && indexControl < last.length) {
        if (first[indexControl] == last[indexControl]) {
            indexControl++
        } else {
            break
        }
    }
    return first.substring(0, indexControl)
}
