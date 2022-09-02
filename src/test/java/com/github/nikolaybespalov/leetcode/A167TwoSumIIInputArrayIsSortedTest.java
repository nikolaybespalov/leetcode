package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A167TwoSumIIInputArrayIsSortedTest {
    A167TwoSumIIInputArrayIsSorted instance = new A167TwoSumIIInputArrayIsSorted();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 3}, instance.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{-1, 0}, -1));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{3, 4}, instance.twoSum(new int[]{-1000, -1, 0, 1}, 1));
    }
}