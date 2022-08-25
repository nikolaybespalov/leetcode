package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A516LongestPalindromicSubsequenceTest {
    A516LongestPalindromicSubsequence instance = new A516LongestPalindromicSubsequence();

    @Test
    public void test1() {
        assertEquals(4, instance.longestPalindromeSubseq("bbbab"));
    }

    @Test
    public void test2() {
        assertEquals(2, instance.longestPalindromeSubseq("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals(1, instance.longestPalindromeSubseq("a"));
    }

    @Test
    public void test4() {
        assertEquals(5, instance.longestPalindromeSubseq("aabaa"));
    }
}