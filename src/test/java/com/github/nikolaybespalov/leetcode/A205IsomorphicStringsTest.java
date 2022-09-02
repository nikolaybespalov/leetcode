package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A205IsomorphicStringsTest {
    A205IsomorphicStrings instance = new A205IsomorphicStrings();

    @Test
    public void test1() {
        assertTrue(instance.isIsomorphic("egg", "add"));
    }

    @Test
    public void test2() {
        assertFalse(instance.isIsomorphic("foo", "bar"));
    }

    @Test
    public void test3() {
        assertTrue(instance.isIsomorphic("paper", "title"));
    }
}