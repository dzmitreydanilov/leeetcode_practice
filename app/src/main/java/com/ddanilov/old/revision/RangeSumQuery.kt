package com.ddanilov.revision

class NumArray(nums: IntArray) {

    val prefix = IntArray(nums.size)
//    [1,3,1,4,1]
    init {
        var sum = 0
        for((i,v) in nums.withIndex()) {
            sum += v
            prefix[i] = sum
        }
    }
//    [1,4,5,9,10]
//[2;3]
    fun sumRange(left: Int, right: Int): Int {
        val prefixR = prefix[right] //9
        val prefixL = if(left == 0) 0 else prefix[left - 1]
        return prefixR - prefixL
    }

}
