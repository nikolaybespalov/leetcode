package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A10RegularExpressionMatchingTest {
    A10RegularExpressionMatching instance = new A10RegularExpressionMatching();

    @Test
    public void test1() {
        assertFalse(instance.isMatch("aa", "a"));
    }

    @Test
    public void test2() {
        assertTrue(instance.isMatch("aa", "a*"));
    }

    @Test
    public void test3() {
        assertTrue(instance.isMatch("ab", ".*"));
    }

    @Test
    public void test4() {
        assertTrue(instance.isMatch("abc", "a*b*c*"));
    }

    @Test
    public void test5() {
        assertTrue(instance.isMatch("aabbcc", "a*b*c*"));
    }

    @Test
    public void test6() {
        assertTrue(instance.isMatch("mississippi", "mis*is*ip*."));
    }

    @Test
    public void test7() {
        assertTrue(instance.isMatch("abcbc", "ab*c*b."));
    }

    @Test
    public void test8() {
        assertFalse(instance.isMatch("ab", ".*c"));
    }

    @Test
    public void test9() {
        assertTrue(instance.isMatch("aa", "aa"));
    }

    @Test
    public void test10() {
        assertFalse(instance.isMatch("aaa", "aaaa"));
    }

    @Test
    public void test11() {
        assertTrue(instance.isMatch("aaa", "ab*a*c*a"));
    }

    @Test
    public void test12() {
        assertFalse(instance.isMatch("aaa", "ab*a"));
    }
}