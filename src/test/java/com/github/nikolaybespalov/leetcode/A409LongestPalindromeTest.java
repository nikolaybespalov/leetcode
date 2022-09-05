package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A409LongestPalindromeTest {
    A409LongestPalindrome instance = new A409LongestPalindrome();

    @Test
    public void test1() {
        assertEquals(7, instance.longestPalindrome("abccccdd"));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.longestPalindrome("a"));
    }
}