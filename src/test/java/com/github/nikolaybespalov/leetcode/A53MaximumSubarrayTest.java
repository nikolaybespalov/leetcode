package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A53MaximumSubarrayTest {
    A53MaximumSubarray instance = new A53MaximumSubarray();

    @Test
    public void test1() {
        assertEquals(6, instance.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.maxSubArray(new int[]{1}));
    }

    @Test
    public void test3() {
        assertEquals(23, instance.maxSubArray(new int[]{5,4,-1,7,8}));
    }
}