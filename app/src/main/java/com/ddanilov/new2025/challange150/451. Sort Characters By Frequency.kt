package com.ddanilov.new2025.challange150

fun main() {
    val s = "tree"
    val result = frequencySort(s)

    println(result)
}


/**
 * tree
 *
 *
 * {
 *  t : 1
 *  r : 1
 *  e : 2
 * }
 */

private fun frequencySort(s: String): String {
    val frequenceList = MutableList<MutableList<Char>>(s.length + 1) { mutableListOf() }
    val map = mutableMapOf<Char, Int>()

    s.forEach {
        map[it] = 1 + map.getOrDefault(it, 0)
    }

    map.forEach { (value, count) ->
        repeat(count) {
            frequenceList[count].add(value)
        }

    }
    var result = ""
    for (i in frequenceList.size - 1 downTo 0) {
        frequenceList[i].forEach {
            result += it
        }
    }

    return result
}
