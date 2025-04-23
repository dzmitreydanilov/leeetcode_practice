package com.ddanilov.new2025.first_iteration

import java.util.Arrays

fun main() {

    val player = intArrayOf(4, 7, 9)
    val trainers = intArrayOf(8, 2, 5, 8)

    val result = matchPlayersAndTrainers(player, trainers)

    println("XXX $result")
}

/**
 * 2, 5, 8, 8
 *       i
 *
 * 4, 7, 9
 * j
 * 4, 5, 8, 9
 *    t
 * 4, 7, 9
 * p
 */
private fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
    Arrays.sort(players)
    Arrays.sort(trainers)

    var p = players.lastIndex
    var t = trainers.lastIndex
    var counter = 0
    while (p >= 0 && t >= 0) {
        if (trainers[t] >= players[p]) {
            counter++
            t--
        }
        p--
    }

    return counter
}
