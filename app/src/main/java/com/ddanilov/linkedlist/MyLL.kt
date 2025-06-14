package com.ddanilov.linkedlist

fun main() {
    val linkedList = LinkedList(10)
    linkedList.prepend(5)
    linkedList.append(16)

    linkedList.insert(1, 100)
    linkedList.remove(1)

    println(linkedList)
}