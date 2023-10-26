package com.ddanilov.topQestions

class Codec {

    private val decodeMap = HashMap<String, String>()
    private val encodeMap = HashMap<String, String>()
    private val encodeChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    private val tinyUrl = "http://tinyurl.com/"
    private val codeLength = 6

    fun encode(longUrl: String): String {
        if (longUrl in encodeMap) return decodeMap[longUrl]!!
        var hashCode = ""

        repeat(codeLength) {
            hashCode += encodeChars.random()
        }
        val encodedLongUrl = tinyUrl + hashCode

        encodeMap[longUrl] = encodedLongUrl
        decodeMap[encodedLongUrl] = longUrl


        return encodedLongUrl
    }


    fun decode(shortUrl: String): String {
        return decodeMap[shortUrl]!!
    }
}
