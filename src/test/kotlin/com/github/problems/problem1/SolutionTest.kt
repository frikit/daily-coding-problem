package com.github.problems.problem1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    @Test
    fun emptyListWhenEmptyListAsInput() {
        assertEquals(false, Solution().findSumInList(emptyList(), 0))
    }

    @Test
    fun emptyListWhenOneElementInTheListAndSumIsDifferent() {
        assertEquals(false, Solution().findSumInList(listOf(1), 9))
    }

    @Test
    fun sumWhen1ElementInTheListAndSumIsTheSameWithSum() {
        assertEquals(true, Solution().findSumInList(listOf(9), 9))
    }

    @Test
    fun sumWhen2ElementsInTheListAndSumIsTheSameWithSum() {
        assertEquals(true, Solution().findSumInList(listOf(4, 5), 9))
    }

    @Test
    fun sumWhen4ElementsInTheListAndSumIsTheSameWithSum() {
        assertEquals(true, Solution().findSumInList(listOf(10, 15, 3, 7), 17))
    }

    @Test
    fun sumWhen5ElementsInTheListAndSumIsTheSameWithSum() {
        assertEquals(true, Solution().findSumInList(listOf(10, 15, 3, 7), 22))
    }
}
