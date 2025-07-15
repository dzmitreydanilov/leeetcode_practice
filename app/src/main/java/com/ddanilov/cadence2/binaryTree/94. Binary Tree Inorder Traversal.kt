package com.ddanilov.cadence2.binaryTree

import com.ddanilov.new2025.challange150.BinaryTree
import com.ddanilov.new2025.challange150.TreeNode

fun main() {
    val tree = BinaryTree()
    tree.insert(1)
    tree.insert(3)
    tree.insert(2)

    val result = inorderTraversal(tree.root)

    result.forEach {
        println(it)
    }

}

private fun inorderTraversal(root: TreeNode?): List<Int> {
    val answer = mutableListOf<Int>()
    inOrder(answer, root)
    return answer
}

private fun inOrder(array: MutableList<Int>, root: TreeNode?) {
    if (root == null) return
    inOrder(array, root.left)
    array.add(root.value)
    inOrder(array, root.right)
}