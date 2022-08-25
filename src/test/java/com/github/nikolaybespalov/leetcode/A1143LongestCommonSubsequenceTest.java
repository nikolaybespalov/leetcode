package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A1143LongestCommonSubsequenceTest {
    A1143LongestCommonSubsequence instance = new A1143LongestCommonSubsequence();

    @Test
    public void test1() {
        assertEquals(3, instance.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void test2() {
        assertEquals(3, instance.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void test3() {
        assertEquals(0, instance.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void test4() {
        assertEquals(1, instance.longestCommonSubsequence("bl", "yby"));
    }

    @Test
    public void test5() {
        assertEquals(2, instance.longestCommonSubsequence("ezupkr", "ubmrapg"));
    }
}