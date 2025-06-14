package com.ddanilov.linkedlist

class LinkedList(val value: Int) {
    var head: ListNode = ListNode(
        value = value,
        next = null
    )

    var tail: ListNode? = head

    var length = 1


    fun append(value: Int) {
        val newNode = ListNode(value, null)
        tail?.next = newNode
        tail = newNode
        length++
    }


    fun prepend(value: Int) {
        val newNow = ListNode(value, null)
        newNow.next = head
        head = newNow
        length++
    }


    fun printList() {
        var currentNode: ListNode? = head
        val result = mutableListOf<Int>()
        while (currentNode != null) {
            println("Current Node $currentNode")
            result.add(currentNode.value)
            currentNode = currentNode.next
        }

        result.forEach {
            print("$it,")
        }
        println()
    }


    fun insert(index: Int, value: Int) {

        if (index >= length) return append(value)

        val newNode = ListNode(value, null)
        val leaderNode = traverstToIndex(index - 1)

        val holdingPointer = leaderNode?.next
        leaderNode?.next = newNode
        newNode.next = holdingPointer
        length++

        printList()
    }

    fun remove(index: Int) {
        val leaderNode = traverstToIndex(index - 1)
        val deletedNode = leaderNode?.next
        leaderNode?.next = deletedNode?.next
        length--

        printList()
    }

    private fun traverstToIndex(index: Int): ListNode? {
        var counter = 0
        var currentNode: ListNode? = head

        while (counter != index) {
            currentNode = currentNode?.next
            counter++
        }

        return currentNode
    }

    override fun toString(): String {
        return "Head: {$head}, Tail: {$tail}, length: $length"
    }
}

class ListNode(
    val value: Int,
    var next: ListNode?
) {
    override fun toString(): String {
        return "Node: value = $value, next: $next"
    }
}