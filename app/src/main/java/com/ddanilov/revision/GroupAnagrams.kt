package com.ddanilov.revision

fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = groupAnagrams(strs)

    println(result)
}

// TC O(nlogn)
// SC O(n)
private fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()

    strs.forEach {
        val key = it.toCharArray().joinToString()
        if (!map.containsKey(key)) {
            map[key] = mutableListOf(it)
        } else {
            map[key]?.add(it)
        }
    }
    return map.values.toList()
}

// TC O(n)
// SC O(n)
private fun groupAnagrams1(strs: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()
    strs.forEach {
        val key = composeKey(it)
        if (!map.containsKey(key)) {
            map[key] = mutableListOf(it)
        } else {
            map[key]?.add(it)
        }
    }
    return map.values.toList()
}

private fun composeKey(str: String): String {
    val frequencyArray = IntArray(26)
    str.forEach {
        //a = 80
        //b = 81
        frequencyArray[it - 'a'] += 1
    }
    return frequencyArray.joinToString()
}
