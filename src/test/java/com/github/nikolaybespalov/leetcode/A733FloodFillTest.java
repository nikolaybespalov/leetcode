package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A733FloodFillTest {
    A733FloodFill instance = new A733FloodFill();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        }, instance.floodFill(new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        }, 1, 1, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, instance.floodFill(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, 0, 0, 0));
    }
}