package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A383RansomNoteTest {
    A383RansomNote instance = new A383RansomNote();

    @Test
    public void test1() {
        assertFalse(instance.canConstruct("a", "b"));
    }

    @Test
    public void test2() {
        assertFalse(instance.canConstruct("aa", "ab"));
    }

    @Test
    public void test3() {
        assertTrue(instance.canConstruct("aa", "aab"));
    }

    @Test
    public void test4() {
        assertTrue(instance.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}