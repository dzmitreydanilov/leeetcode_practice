package com.ddanilov.revision

class Codec() {

    private val encodeMap = mutableMapOf<String, String>()
    private val decodeMap = mutableMapOf<String, String>()
    val encodeCharacters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val tinyUrl = "http://tinyurl.com/"

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String {
        if (longUrl in encodeMap) return encodeMap[longUrl]!!
        var fakeHashCode = ""
        repeat(6) {
            fakeHashCode += encodeCharacters.random()
        }
        val encodeLongUrl = tinyUrl + fakeHashCode
        encodeMap[longUrl] = encodeLongUrl
        decodeMap[encodeLongUrl] = longUrl

        return encodeLongUrl
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String {
        return decodeMap[shortUrl]!!
    }
}
