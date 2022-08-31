package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A704BinarySearchTest {
    A704BinarySearch instance = new A704BinarySearch();

    @Test
    public void test1() {
        assertEquals(4, instance.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void test2() {
        assertEquals(-1, instance.search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    public void test3() {
        assertEquals(0, instance.search(new int[]{5}, 5));
    }

    @Test
    public void test4() {
        assertEquals(-1, instance.search(new int[]{5}, 4));
    }

    @Test
    public void test5() {
        assertEquals(-1, instance.search(new int[]{5}, 6));
    }
}