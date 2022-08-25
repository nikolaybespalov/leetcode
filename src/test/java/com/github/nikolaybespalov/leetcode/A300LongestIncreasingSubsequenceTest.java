package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A300LongestIncreasingSubsequenceTest {
    A300LongestIncreasingSubsequence instance = new A300LongestIncreasingSubsequence();

    @Test
    public void test1() {
        assertEquals(4, instance.lengthOfLIS(new int[]{
                10, 9, 2, 5, 3, 7, 101, 18
        }));
    }

    @Test
    public void test2() {
        assertEquals(4, instance.lengthOfLIS(new int[]{
                0, 1, 0, 3, 2, 3
        }));
    }

    @Test
    public void test3() {
        assertEquals(1, instance.lengthOfLIS(new int[]{
                7, 7, 7, 7, 7, 7, 7
        }));
    }

    @Test
    public void test4() {
        assertEquals(1, instance.lengthOfLIS(new int[]{
                3, 2, 1
        }));
    }

    @Test
    public void test5() {
        assertEquals(6, instance.lengthOfLIS(new int[]{
                3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12
        }));
    }
}