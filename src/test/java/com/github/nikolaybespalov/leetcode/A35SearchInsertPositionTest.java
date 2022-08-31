package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A35SearchInsertPositionTest {
    A35SearchInsertPosition instance = new A35SearchInsertPosition();

    @Test
    public void test1() {
        assertEquals(2, instance.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void test3() {
        assertEquals(4, instance.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    public void test4() {
        assertEquals(0, instance.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}