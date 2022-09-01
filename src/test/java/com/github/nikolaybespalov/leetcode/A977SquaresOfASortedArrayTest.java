package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A977SquaresOfASortedArrayTest {
    A977SquaresOfASortedArray instance = new A977SquaresOfASortedArray();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, instance.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, instance.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 1, 1, 1}, instance.sortedSquares(new int[]{-1, -1, 1, 1}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{1, 4, 9, 16}, instance.sortedSquares(new int[]{-4, -3, -2, -1}));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{1, 4, 9, 16}, instance.sortedSquares(new int[]{1, 2, 3, 4}));
    }
}