package com.ddanilov.new2025.challange150

class BinaryTree {
    var root: TreeNode? = null

    fun insert(value: Int) {
        val newNode = TreeNode(value)
        if (root == null) {
            root = newNode
        } else {
            var currentNode = root
            while (true) {
                if (value < (currentNode?.value ?: 0)) {
                    // Left
                    if (currentNode?.left == null) {
                        currentNode?.left = newNode
                        return
                    }
                    currentNode = currentNode.left
                } else {
                    // Right > or ==
                    if (currentNode?.right == null) {
                        currentNode?.right = newNode
                        return
                    }
                    currentNode = currentNode.right
                }
            }
        }
    }

    fun lookUp(value: Int): TreeNode? {
        if (root == null) {
            return null
        }

        var currentNode = root

        while (currentNode != null) {
            currentNode = if (value < currentNode.value) {
                currentNode.left
            } else if (value > currentNode.value) {
                currentNode.right
            } else {
                return currentNode
            }
        }
        return null
    }
}

fun printTree(node: TreeNode?, indent: String = "", isRight: Boolean = true) {
    if (node == null) return

    printTree(node.right, indent + if (isRight) "        " else " |      ", true)
    println(indent + (if (isRight) " /" else " \\") + "----- ${"%3d".format(node.value)}")
    printTree(node.left, indent + if (isRight) " |      " else "        ", false)
}

class TreeNode(val value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {
    val tree = BinaryTree()
    tree.insert(10)
    tree.insert(5)
    tree.insert(15)
    tree.insert(3)
    tree.insert(7)
    tree.insert(12)
    tree.insert(18)

   val result = tree.lookUp(18)

    println("XXX ${result?.value}")
}