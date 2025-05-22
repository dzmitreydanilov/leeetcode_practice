package com.ddanilov.new2025.challange150

import kotlin.collections.mutableMapOf

fun main() {
    val s = arrayOf("i", "love", "leetcode", "i", "love", "coding")
    val k = 2

    val result = topKFrequent(s, k)

    result.forEach {
        println(it)
    }
}

/**
 * "i", "love", "leetcode", "i", "love", "coding"
 *
 */
private fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val map = mutableMapOf<String, Int>()
    val bucket = MutableList<MutableList<String>>(words.size + 1) { mutableListOf() }

    words.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    val result = mutableListOf<String>()
    map.forEach { (value, count) ->
        bucket[count].add(value)
    }

    for (i in bucket.lastIndex downTo 0) {
        if (bucket[i].isNotEmpty()) {
            bucket[i].sort()
            for (word in bucket[i]) {
                result.add(word)
                if (result.size == k) return result
            }
        }
    }
    return result
}