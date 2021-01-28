package com.github.problems.problem2

class Solution {

    fun productOfRest(input: List<Int>): List<Int> {
        if (input.isEmpty()) return emptyList()
        if (input.size == 1) return input

        return input.mapIndexed { index, _ ->
            var res = 1
            input.forEachIndexed { index2, ele ->
                if (index != index2) {
                    res *= ele
                }
            }

            res
        }
    }
}
