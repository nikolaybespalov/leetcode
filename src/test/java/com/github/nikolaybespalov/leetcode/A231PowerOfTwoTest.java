package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A231PowerOfTwoTest {
    A231PowerOfTwo instance = new A231PowerOfTwo();

    @Test
    public void test1() {
        assertTrue(instance.isPowerOfTwo(2));
    }

    @Test
    public void test2() {
        assertTrue(instance.isPowerOfTwo(4));
    }

    @Test
    public void test3() {
        assertTrue(instance.isPowerOfTwo(1024));
    }

    @Test
    public void test4() {
        assertFalse(instance.isPowerOfTwo(0));
    }

    @Test
    public void test5() {
        assertFalse(instance.isPowerOfTwo(-1024));
    }

    @Test
    public void test6() {
        assertFalse(instance.isPowerOfTwo(7));
    }
}