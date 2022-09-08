package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A54201MatrixTest {
    A54201Matrix instance = new A54201Matrix();

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }, instance.updateMatrix(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        }, instance.updateMatrix(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        }));
    }
}