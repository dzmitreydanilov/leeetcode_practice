package com.ddanilov.cadence2.arrays

import java.util.concurrent.locks.ReentrantLock

fun main() {

    val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)

    val result = maxArea(height)

    print(result)
    val foo = { test: Int -> "Just Testing $test" }

}

private fun maxArea(height: IntArray): Int {
    var l = 0
    var r = height.lastIndex
    var maxL = height[l]
    var maxR = height[r]
    var answer = 0

    while (l < r) {
        val new = (r - l) * minOf(maxL, maxR)
        answer = maxOf(new, answer)
        if (maxL <= maxR) {
            l++
            maxL = maxOf(maxL, height[l])
        } else {
            r--
            maxR = maxOf(maxR, height[r])
        }
    }

    return answer
}

class TestClass1 {
    private val bonusesLock1 = Unit
    private val incrementLock2 = Unit
    private var counter = 0
    private var bonuses = 0


    fun addBonuses() {
        synchronized(bonusesLock1) {
            bonuses++
        }
    }

    fun increment() {
        synchronized(incrementLock2) {
            counter++
        }
    }
}


class TestClass2 {
    private val incrementLock1 = Unit
    private val incrementLock2 = Unit
    private var counter = 0

    @Synchronized
    fun increment() {
        counter++
    }

    @Synchronized
    fun decrement() {
        counter--
    }
}

class TestClass3 {
    private val lock = ReentrantLock()
    private var counter = 0


    fun increment() {
        counter++
    }

    fun decrement() {
        counter--
    }
}