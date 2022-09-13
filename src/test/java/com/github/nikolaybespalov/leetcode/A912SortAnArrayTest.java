package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A912SortAnArrayTest {
    A912SortAnArray instance = new A912SortAnArray();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{
                1, 2, 3, 5
        }, instance.sortArray(new int[]{
                5, 2, 3, 1
        }));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{
                0, 0, 1, 1, 2, 5
        }, instance.sortArray(new int[]{
                5, 1, 1, 2, 0, 0
        }));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{
                -5, -2, 3
        }, instance.sortArray(new int[]{
                -2, 3, -5
        }));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{
                -7, -5, -4, -1, -1, 0, 0, 4, 7, 9
        }, instance.sortArray(new int[]{
                -4, 0, 7, 4, 9, -5, -1, 0, -7, -1
        }));
    }
}