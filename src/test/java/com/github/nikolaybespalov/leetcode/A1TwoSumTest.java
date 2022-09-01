package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A1TwoSumTest {
    A1TwoSum instance = new A1TwoSum();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{0, 1}, instance.twoSum(new int[]{3, 3}, 6));
    }
}