package com.ddanilov.topQestions

fun main() {
    val nums = intArrayOf(4, 5, 3, 2, 1)
    println(findRelativeRanks(nums).joinToString(" "))
}

// O(n)
// O(n)
private fun findRelativeRanks(score: IntArray): Array<String> {
    return with(score.sortedDescending()) {
        // 5, 4 ,3 ,2, 1
        score.map {
            indexOf(it).rank
        }.toTypedArray()
    }
}

private val Int.rank
    get() = when (this) {
        0 -> "Gold Medal"
        1 -> "Silver Medal"
        2 -> "Bronze Medal"
        else -> (this + 1).toString()
    }
