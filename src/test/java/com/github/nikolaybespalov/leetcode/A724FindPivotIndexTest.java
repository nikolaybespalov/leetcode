package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A724FindPivotIndexTest {
    A724FindPivotIndex instance = new A724FindPivotIndex();

    @Test
    public void test1() {
        assertEquals(3, instance.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void test2() {
        assertEquals(-1, instance.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(0, instance.pivotIndex(new int[]{2, 1, -1}));
    }

    @Test
    public void test4() {
        assertEquals(0, instance.pivotIndex(new int[]{1}));
    }

    @Test
    public void test5() {
        assertEquals(0, instance.pivotIndex(new int[]{1, 0}));
    }
}