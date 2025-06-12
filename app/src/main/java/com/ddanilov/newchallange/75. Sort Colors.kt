package com.ddanilov.newchallange

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)
    sortColors(nums)
}


private fun sortColors(nums: IntArray): Unit {

}


/**
 * 2, 0, 2, 1, 1, 0
 */
private fun sortColorsBucket(nums: IntArray): Unit {
    val bucket = MutableList(3) { 0 }

    val map = mutableMapOf<Int, Int>()

    val result = mutableListOf<Int>()

    nums.forEach {
        map[it] = 1 + map.getOrDefault(it, 0)
    }

    map.forEach { k, v ->
        bucket[k] = v
    }

    for (i in bucket.indices) {
        repeat(bucket[i]) {
            result.add(i)
        }
    }

    result.forEach {
        println(it)
    }
}


private fun mergeSort(nums: IntArray, l: Int, r: Int) {
    if (l == r) return

    val m = (l + r) / 2

    mergeSort(nums, l, m)
    mergeSort(nums, m + 1, r)
    merge(nums, r, l, m)
}

private fun merge(nums: IntArray, R: Int, L: Int, M: Int) {
    val left = nums.slice(L..M)
    val right = nums.slice(M + 1..R)

    var l = 0
    var r = 0
    var k = L

    while (l < left.size && r < right.size) {
        if (left[l] < right[r]) {
            nums[k] = left[l]
            l++
        } else {
            nums[k] = right[r]
            r++
        }
        k++
    }

    while (l < left.size) {
        nums[k] = left[l]
        l++
        k++
    }

    while (r < right.size) {
        nums[k] = right[r]
        r++
        k++
    }
}