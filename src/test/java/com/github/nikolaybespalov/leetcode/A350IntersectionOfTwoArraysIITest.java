package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A350IntersectionOfTwoArraysIITest {
    A350IntersectionOfTwoArraysII instance = new A350IntersectionOfTwoArraysII();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2}, instance.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{9, 4}, instance.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

}