package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A1646GetMaximumInGeneratedArrayTest {
    A1646GetMaximumInGeneratedArray instance = new A1646GetMaximumInGeneratedArray();

    @Test
    public void test0() {
        assertEquals(0, instance.getMaximumGenerated(0));
    }

    @Test
    public void test1() {
        assertEquals(1, instance.getMaximumGenerated(1));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.getMaximumGenerated(2));
    }

    @Test
    public void test3() {
        assertEquals(2, instance.getMaximumGenerated(3));
    }

    @Test
    public void test4() {
        assertEquals(2, instance.getMaximumGenerated(4));
    }

    @Test
    public void test7() {
        assertEquals(3, instance.getMaximumGenerated(7));
    }

    @Test
    public void test100() {
        assertEquals(21, instance.getMaximumGenerated(100));
    }
}