package com.ddanilov.newchallange

fun main() {
    val word = arrayOf("i", "love", "leetcode", "i", "love", "coding")
    val k = 2

    val result = topKFrequent(word, k)

    result.forEach {
        println(it)
    }
}

private fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val bucket = MutableList<MutableList<String>>(size = words.size + 1) { mutableListOf() }
    val counterMap = mutableMapOf<String, Int>()

    words.forEach { word ->
        counterMap[word] = 1 + counterMap.getOrDefault(word, 0)
    }

    counterMap.forEach { (k, v) ->
        bucket[v].add(k)
    }

    val result = mutableListOf<String>()
    for (i in bucket.lastIndex downTo 0) {
        if (bucket[i].isNotEmpty()) {
            bucket[i].sort()
            bucket[i].forEach {
                if (result.size < k) {
                    result.add(it)
                } else {
                    return@forEach
                }
            }
        }
    }

    return result
}