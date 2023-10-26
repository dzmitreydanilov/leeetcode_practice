package com.ddanilov.revision

fun main() {
    val emails = arrayOf(
        "test.email+alex@leetcode.com",
        "test.e.mail+bob.cathy@leetcode.com",
        "testemail+david@lee.tcode.com"
    )
    val result = numUniqueEmails(emails)
    println(result)
}

private fun numUniqueEmails(emails: Array<String>): Int {
    val uniqueEmail = mutableSetOf<String>()
    emails.forEach { email ->
        val addPosition = email.indexOf("@")

        var localName = email.substring(0, addPosition)
        val domainName = email.substring(addPosition)

        if(localName.contains("+")) {
            val plusPosition = localName.indexOf("+")
            localName = localName.substring(0, plusPosition)
        }

        val newName = localName.replace(".", "")
        uniqueEmail.add(newName + domainName)
    }

    return uniqueEmail.size
}
