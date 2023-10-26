package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
    val result = longestConsecutive1(nums)

    println(result)
}

//[-4,-5, 2,3,4,5,6,7,8]
// TC O(nlogn)
private fun longestConsecutive(nums: IntArray): Int {
    if (nums.size == 1) return 1
    var maxLength = 0
    var currentLength = 1
    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1] + 1) {
            currentLength++
        } else if (nums[i] != nums[i - 1]) {
            currentLength = 1
        }

        maxLength = maxOf(maxLength, currentLength)
    }

    return maxLength
}

// [100,4,200,1,3,2]
// [1,2,3,4]  [100]  [200]
private fun longestConsecutive1(nums: IntArray): Int {
    if (nums.size == 1) return 1
    val set = HashSet<Int>()
    nums.forEach { set.add(it) }
    var maxLength = 0

    for (num in nums) {
        val isStartOfConsequtiveSequence = !set.contains(num - 1)
        if (isStartOfConsequtiveSequence) {
            var nextConsequtiveSequence = num + 1
            var currentLength = 1
            while (set.contains(nextConsequtiveSequence)) {
                nextConsequtiveSequence++
                currentLength++
            }
            maxLength = maxOf(currentLength, maxLength)
        }
    }
    return maxLength
}
