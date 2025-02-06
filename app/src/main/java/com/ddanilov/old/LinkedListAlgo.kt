package com.ddanilov

class CustomLinkedList(var value: Int) {
    inner class Node(var value: Int) {

        var next: Node? = null
    }

    private var head: Node = Node(value)
    private var tail: Node = head
    private var length = 1

    fun append(value: Int): CustomLinkedList {
        val newNode = Node(value)
        tail.next = newNode
        tail = newNode
        length++
        return this
    }

    fun prepend(value: Int): CustomLinkedList {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
        length++
        return this
    }

    fun printList(): List<Int> {
        val array = mutableListOf<Int>()
        var currentNode: Node? = head
        while (currentNode != null) {
            array.add(currentNode.value)
            currentNode = currentNode.next
        }
        return array
    }

    fun insert(index: Int, value: Int): List<Int> {
        if (index >= length) {
            return append(value).printList()
        }
        val newNode = Node(value)
        val leader = traverseToIndex(index - 1)
        val holdingPointer = leader.next
        leader.next = newNode
        newNode.next = holdingPointer
        length++
        return printList()
    }

    private fun traverseToIndex(index: Int): Node {
        var counter = 0
        var currentNode: Node = head
        while (counter != index) {
            currentNode = currentNode.next ?: throw IllegalArgumentException("Index out of bounds")
            counter++
        }
        return currentNode
    }

    fun remove(index: Int): List<Int> {
        if (index < 0 || index >= length) {
            throw IllegalArgumentException("Index out of bounds")
        }

        if (index == 0) {
            head = head.next ?: throw IllegalArgumentException("List is empty")
            length--
            return printList()
        }
        val leader = traverseToIndex(index - 1)
        val unwantedNode = leader.next ?: throw IllegalArgumentException("Index out of bounds")
        leader.next = unwantedNode.next
        length--
        return printList()
    }

    fun reverse(): List<Int> {
        if (head.next == null) {
            return printList()
        }
//        1, 10, 5, 16, 88
        var first: Node = head
        tail = head
        var second: Node? = first.next

        while (second != null) {
            val temp = second.next
            second.next = first
            first = second
            second = temp
            println("temp ${temp?.value}, first: ${first?.value}, second.value: ${second?.value} second.next: ${second?.next?.value} tail: ${tail.value}")
        }

        head.next = null
        head = first

        return printList()
    }
    // first = 1
    // second = 10 second.next = 5
    // temp = 5
    // first = 10
    // second = 5 second.next = 1
}

fun main() {
    val myLinkedList = CustomLinkedList(10)
    myLinkedList.append(5)
    myLinkedList.append(16)
    myLinkedList.prepend(1)
//    println(myLinkedList.printList())
//    myLinkedList.insert(2, 99)
    myLinkedList.insert(20, 88)
    println(myLinkedList.printList())
//    myLinkedList.remove(2)
    println(myLinkedList.reverse())
}
