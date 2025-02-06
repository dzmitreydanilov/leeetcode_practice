package com.ddanilov.new2025

fun main() {

    val inputValue = "Hello Dima, how are you?"

    val result = revertString(inputValue)

    println("Reverted string: $result")
}

private fun revertString(value: String): String {
   return if(value.isNotEmpty() && value.length > 1)  {
        var result = ""
        for (i in value.length - 1 downTo 0) {
            result += value[i]
        }

         result
    } else {
        ""
    }
}
