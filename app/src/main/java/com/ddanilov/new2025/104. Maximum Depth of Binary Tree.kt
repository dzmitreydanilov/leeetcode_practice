package com.ddanilov.new2025

import com.ddanilov.new2025.challange150.TreeNode
import java.util.LinkedList
import java.util.Queue
import kotlin.collections.isNotEmpty

fun main() {

}


fun maxDepth(root: TreeNode?): Int {
    val queue: Queue<TreeNode?> = LinkedList<TreeNode?>()
    var levelsCount = -1

    queue.add(root)

    while(true) {
        var nodesPerLevel = queue.size
        if(nodesPerLevel == 0 ) {
            return levelsCount
        }

        while(nodesPerLevel > 0) {
            val current = queue.poll()

            if(current?.left != null) queue.add(current.left)
            if(current?.right != null) queue.add(current.right)
            nodesPerLevel--
        }

        levelsCount++
    }

    return levelsCount
}