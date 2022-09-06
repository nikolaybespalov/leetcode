package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A215KthLargestElementInAnArrayTest {
    A215KthLargestElementInAnArray instance = new A215KthLargestElementInAnArray();

    @Test
    public void test1() {
        assertEquals(5, instance.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void test2() {
        assertEquals(4, instance.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}