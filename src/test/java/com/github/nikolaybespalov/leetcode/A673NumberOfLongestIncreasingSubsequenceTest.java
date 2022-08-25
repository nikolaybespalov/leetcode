package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A673NumberOfLongestIncreasingSubsequenceTest {
    A673NumberOfLongestIncreasingSubsequence instance = new A673NumberOfLongestIncreasingSubsequence();

    @Test
    public void test1() {
        assertEquals(2, instance.findNumberOfLIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void test2() {
        assertEquals(5, instance.findNumberOfLIS(new int[]{2,2,2,2,2}));
    }
}