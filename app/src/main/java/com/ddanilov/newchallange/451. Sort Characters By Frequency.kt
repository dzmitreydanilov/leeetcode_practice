package com.ddanilov.newchallange


fun main() {
    val s = "tree"

    val result = frequencySort(s)

    println(result)
}


/**
 * tree
 *
 * 0   1    2  3 4 5
 *   [t,r] [e]
 * eetr
 */
private fun frequencySort(s: String): String {
    val bucket = MutableList<MutableList<Char>>(s.length + 1) { mutableListOf() }

    val counterMap = mutableMapOf<Char, Int>()

    s.forEach {
        counterMap[it] = 1 + counterMap.getOrDefault(it, 0)
    }

    counterMap.forEach { (k, v) ->
        bucket[v].add(k)
    }

    var result = ""

    for (i in bucket.lastIndex downTo 0) {
        bucket[i].forEach { char ->
            repeat(i) {
                result += char
            }
        }
    }

    return result
}