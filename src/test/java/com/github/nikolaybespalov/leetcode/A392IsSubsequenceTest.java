package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A392IsSubsequenceTest {
    A392IsSubsequence instance = new A392IsSubsequence();

    @Test
    public void test1() {
        assertTrue(instance.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void test2() {
        assertFalse(instance.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void test3() {
        assertTrue(instance.isSubsequence("a", "ab"));
    }

    @Test
    public void test4() {
        assertTrue(instance.isSubsequence("a", "a"));
    }

    @Test
    public void test5() {
        assertTrue(instance.isSubsequence("ab", "baba"));
    }

    @Test
    public void test6() {
        assertTrue(instance.isSubsequence("ab", "bacacba"));
    }

}