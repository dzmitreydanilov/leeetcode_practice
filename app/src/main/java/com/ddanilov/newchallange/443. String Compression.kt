package com.ddanilov.newchallange

fun main() {
    val nums = charArrayOf('a', 'a', 'a', 'b', 'b', 'c', 'c', 'c')
    val result = compress(nums)

    print(result)
}

/**
 * 'a', 'a', 'b', 'b', 'c', 'c', 'c'
 *            i
 *       k
 *  occurs = 2
 *
 *
 *  'a', 'a', 'b', 'b', 'c', 'c', 'c'
 *
 */
private fun compress(chars: CharArray): Int {
    var i = 0
    var k = 0

    while (i < chars.size) {
        var currChar = chars[i]
        var currCharOccurs = 0

        while (i < chars.size && chars[i] == currChar) {
            currCharOccurs++
            i++
        }

        chars[k] = currChar
        k++

        if (currCharOccurs > 1) {
            val charOccursString = currCharOccurs.toString()
            for(s in charOccursString) {
                chars[k] = s
                k++
            }
        }
    }
    return k
}