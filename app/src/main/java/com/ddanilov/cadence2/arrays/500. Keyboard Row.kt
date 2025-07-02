package com.ddanilov.cadence2.arrays

fun main() {


}

private fun findWords(words: Array<String>): Array<String> {
    val alphabet = IntArray(26)
    val answer = mutableListOf<String>()

    for (char in "qwertyuiop") alphabet[char - 'a'] = 1
    for (char in "asdfghjkl") alphabet[char - 'a'] = 2
    for (char in "zxcvbnm") alphabet[char - 'a'] = 3


    for (word in words) {
        val normalized = word.lowercase()
        val row = alphabet[normalized[0] - 'a']
        var sameRow = true

        for (char in word) {
            if (alphabet[char - 'a'] != row) {
                sameRow = false
                break
            }
        }

        if (sameRow) {
            answer.add(word)
        }
    }

    return answer.toTypedArray()
}