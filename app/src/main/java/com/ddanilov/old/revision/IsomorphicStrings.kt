package com.ddanilov.revision

fun main() {
    val s = "foo"
    val t = "bar"
    val res = isIsomorphic(s, t)

    println(res)
}

private fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map = HashMap<Char, Char>()

    for (i in s.indices) {
        val original = s[i]
        val replacement = t[i]

        if (!map.containsKey(original)) {
            if (!map.containsValue(replacement)) {
                map[original] = replacement
            } else {
                return false
            }
        } else {
            val char = map[original]
            if (char != replacement) {
                return false
            }
        }
    }
    return  false
}
