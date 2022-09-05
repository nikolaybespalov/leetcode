package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A566ReshapeTheMatrixTest {
    A566ReshapeTheMatrix instance = new A566ReshapeTheMatrix();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{
                {1, 2, 3, 4}
        }, instance.matrixReshape(new int[][]{
                {1, 2},
                {3, 4}
        }, 1, 4));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{
                {1, 2},
                {3, 4}
        }, instance.matrixReshape(new int[][]{
                {1, 2},
                {3, 4}
        }, 2, 2));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[][]{
                {1},
                {2},
                {3},
                {4}
        }, instance.matrixReshape(new int[][]{
                {1, 2},
                {3, 4}
        }, 4, 1));
    }
}