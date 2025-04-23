package com.ddanilov.new2025.first_iteration

fun main() {

    val s = "anagramg"
    val t = "nagaramf"

    val result = isAnagramBrut3(s, t)

    println(result)

}

private fun isAnagramBrut1(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val s1 = s.toCharArray()
    s1.sort()
    val t1 = t.toCharArray()
    t1.sort()

    var i = 0
    var j = 0

    while (i < s.length) {
        if (s1[i] != t1[i]) {
            return false
        }
        i++
        j++
    }

    return true
}

fun isAnagramBrut2(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val mapS = mutableMapOf<Char, Int>()
    val mapt = mutableMapOf<Char, Int>()

    s.forEachIndexed { i, v ->
        mapS[v] = mapS.getOrDefault(v, 0) + 1
    }

    t.forEachIndexed { i, v ->
        mapt[v] = mapt.getOrDefault(v, 0) + 1
    }

    mapS.keys.forEach {
        if (mapS[it] != mapt[it]) return false
    }

    return true
}

private fun isAnagramBrut3(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val charArray = IntArray(26)

    for (i in s.indices) {
        charArray[s[i] - 'a']++
        charArray[t[i] - 'a']--
    }

    charArray.forEach {
        if (it != 0) return false
    }

    return true
}