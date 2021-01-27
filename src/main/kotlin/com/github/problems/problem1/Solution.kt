package com.github.problems.problem1

class Solution {

    fun findSumInList(list: List<Int>, sum: Int): Boolean {
        val cache = hashSetOf<Pair<Int, Int>>()
        if (list.isEmpty()) return false
        if (list.size == 1 && list.first() != sum) return false
        if (list.size == 1 && list.first() == sum) return true

        list.forEach { i ->
            run {
                list.forEach { j ->
                    run {
                        if (i != j && !cache.contains(i to j)) {
                            if (i + j == sum) {
                                return true
                            } else {
                                cache.add(i to j)
                            }
                        }
                    }
                }
            }
        }

        return false
    }
}
