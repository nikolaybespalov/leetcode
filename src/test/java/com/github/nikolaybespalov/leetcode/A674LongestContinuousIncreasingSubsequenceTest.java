package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A674LongestContinuousIncreasingSubsequenceTest {
    A674LongestContinuousIncreasingSubsequence instance = new A674LongestContinuousIncreasingSubsequence();

    @Test
    public void test1() {
        assertEquals(3, instance.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void test3() {
        assertEquals(4, instance.findLengthOfLCIS(new int[]{1, 3, 5, 7}));
    }
}