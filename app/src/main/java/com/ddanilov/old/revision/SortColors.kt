package com.ddanilov.revision

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)
    val result = sortColors(nums)

    println(result.joinToString(" "))
}

//2,0,2,1,1,0
private fun sortColors(nums: IntArray): IntArray {
    return mergeSort(nums, 0, nums.lastIndex)
}

private fun mergeSort(nums: IntArray, l: Int, r: Int): IntArray {
    if (r == l) return nums
    val m = (l + r) / 2
    mergeSort(nums, l, m + 1)
    mergeSort(nums, m + 1, r)
    mergeArray(nums, m, l, r)
    return nums
}


private fun mergeArray(nums: IntArray, m: Int, l: Int, r: Int): IntArray {
    val arrayL = nums.copyOfRange(l, m + 1)
    val arrayR = nums.copyOfRange(m + 1, r + 1)

    var i = l
    var j = 0
    var k = 0

    while (j < arrayL.size && k < arrayR.size) {
        if(arrayL[j] < arrayR[k]) {
            nums[i] = arrayL[j]
            j++
        } else {
            nums[i] = arrayR[k]
            k++
        }
    }

    while (j < arrayL.size) {
        nums[i] = arrayL[j]
        j++
        i++
    }

    while (k < arrayR.size) {
        nums[i] = arrayR[k]
        k++
        i++
    }

    return nums
}
