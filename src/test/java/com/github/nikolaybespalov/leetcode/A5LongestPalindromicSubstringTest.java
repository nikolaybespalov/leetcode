package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A5LongestPalindromicSubstringTest {
    A5LongestPalindromicSubstring instance = new A5LongestPalindromicSubstring();

    @Test
    public void test1() {
        assertEquals("bab", instance.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        assertEquals("bb", instance.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals("a", instance.longestPalindrome("a"));
    }

    @Test
    public void test4() {
        assertEquals("bb", instance.longestPalindrome("bb"));
    }

    @Test
    public void test5() {
        assertEquals("aca", instance.longestPalindrome("aacabdkacaa"));
    }
}