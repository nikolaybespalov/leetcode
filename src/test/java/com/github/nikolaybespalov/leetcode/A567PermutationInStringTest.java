package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A567PermutationInStringTest {
    A567PermutationInString instance = new A567PermutationInString();

    @Test
    public void test1() {
        assertTrue(instance.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void test2() {
        assertFalse(instance.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void test3() {
        assertTrue(instance.checkInclusion("a", "ab"));
    }
}