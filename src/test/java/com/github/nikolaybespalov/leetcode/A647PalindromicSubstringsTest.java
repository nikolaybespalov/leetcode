package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A647PalindromicSubstringsTest {
    A647PalindromicSubstrings instance = new A647PalindromicSubstrings();

    @Test
    public void test1() {
        assertEquals(3, instance.countSubstrings("abc"));
    }

    @Test
    public void test2() {
        assertEquals(6, instance.countSubstrings("aaa"));
    }
}