package com.ddanilov.newchallange

fun main() {

}

private fun gcdOfStrings(str1: String, str2: String): String {

    if(str1 + str2 != str2 + str1) {
        return ""
    }

    val gcd = gcd(str1.length, str2.length)

    return str1.take(gcd)
}

/**
 * GCD(A,B) -> GCD(B, A % B)
 */
private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

