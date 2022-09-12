package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class A438FindAllAnagramsInAStringTest {
    A438FindAllAnagramsInAString instance = new A438FindAllAnagramsInAString();

    @Test
    public void test1() {
        assertEquals(Arrays.asList(0, 6), instance.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(0, 1, 2), instance.findAnagrams("abab", "ab"));
    }
}