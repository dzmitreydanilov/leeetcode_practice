package com.ddanilov.cadence2.arrays

fun main() {
    val strings = listOf("neet", "code", "love", "you")

    val encodedString = encodeString(strings)

    println("Encoded: $encodedString")

    val decodedString = decodeString(encodedString)

    decodedString.forEach {
        println(it)
    }
}

private fun encodeString(input: List<String>): String {

    if (input.isEmpty()) return ""

    val delimiter = "$"
    var encodingResult = ""

    for (i in input.indices) {
        val currString = input[i]
        val stringSize = currString.length
        encodingResult += "$stringSize$delimiter$currString"
    }

    return encodingResult
}


private fun decodeString(input: String): List<String> {
    val delimiter = "$"

    val answer = mutableListOf<String>()

    var start = 0

    while (start < input.length) {
        var decodedString = ""
        val delimiterIndex = input.indexOf(string = delimiter, startIndex = start)
        val currStringLengthAsString = input.substring(start, delimiterIndex)
        val wordSizeInt = currStringLengthAsString.length
        val stringSize = currStringLengthAsString.toInt()

        decodedString += input.substring(
            start + wordSizeInt + 1,
            start + wordSizeInt + 1 + stringSize
        )

        answer.add(decodedString)
        start += wordSizeInt + 1 + stringSize
    }

    return answer
}