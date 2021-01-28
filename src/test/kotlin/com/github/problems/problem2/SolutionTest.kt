package com.github.problems.problem2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun productOfEmptyListWhenIsEmptyList() {
        assertEquals(emptyList<Int>(), Solution().productOfRest(emptyList()))
    }

    @Test
    fun productOfSameListWhenIs1ElementInList() {
        assertEquals(listOf(1), Solution().productOfRest(listOf(1)))
    }

    @Test
    fun productOfReturnCorrectListWhenIs4ElementInList() {
        assertEquals(listOf(120, 60, 40, 30, 24), Solution().productOfRest(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun productOfReturnCorrectListWhenIs3ElementInList() {
        assertEquals(listOf(2, 3, 6), Solution().productOfRest(listOf(3, 2, 1)))
    }
}
