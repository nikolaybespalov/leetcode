package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A14LongestCommonPrefixTest {
    A14LongestCommonPrefix instance = new A14LongestCommonPrefix();

    @Test
    public void test0() {
        assertEquals("", instance.longestCommonPrefix(new String[]{
                ""
        }));
    }

    @Test
    public void test1() {
        assertEquals("a", instance.longestCommonPrefix(new String[]{
                "ab",
                "ac",
                "ad"
        }));
    }

    @Test
    public void test2() {
        assertEquals("fl", instance.longestCommonPrefix(new String[]{
                "flower",
                "flow",
                "flight"
        }));
    }

    @Test
    public void test3() {
        assertEquals("", instance.longestCommonPrefix(new String[]{
                "dog",
                "racecar",
                "car"
        }));
    }

    @Test
    public void test4() {
        assertEquals("", instance.longestCommonPrefix(new String[]{
                "",
                "b"
        }));
    }
}