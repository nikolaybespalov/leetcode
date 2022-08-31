package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A1480RunningSumOf1dArrayTest {
    A1480RunningSumOf1dArray instance = new A1480RunningSumOf1dArray();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 3, 6, 10}, instance.runningSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, instance.runningSum(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, instance.runningSum(new int[]{3, 1, 2, 10, 1}));
    }
}