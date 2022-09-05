package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A242ValidAnagramTest {
    A242ValidAnagram instance = new A242ValidAnagram();

    @Test
    public void test1() {
        assertTrue(instance.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        assertFalse(instance.isAnagram("rat", "car"));
    }
}