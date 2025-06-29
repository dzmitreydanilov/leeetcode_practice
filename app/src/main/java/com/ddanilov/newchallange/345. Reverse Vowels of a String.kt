package com.ddanilov.newchallange

fun main() {
    val s = "IceCreAm"
    val result = reverseVowels(s)

    print(result)
}

private fun reverseVowels(s: String): String {
    var l = 0
    var r = s.lastIndex

    val charArray = s.toCharArray()

    val vowels: Set<Char> = setOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    while (l < r) {
        while (l < r && charArray[l] !in vowels) {
            l++
        }

        while (l < r && charArray[r] !in vowels) {
            r--
        }

        if (l < r) {
            val temp = charArray[l]
            charArray[l] = charArray[r]
            charArray[r] = temp
            l++
            r--
        }
    }

    return String(charArray)
}