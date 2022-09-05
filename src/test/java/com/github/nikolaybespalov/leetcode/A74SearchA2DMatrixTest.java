package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A74SearchA2DMatrixTest {
    A74SearchA2DMatrix instance = new A74SearchA2DMatrix();

    @Test
    public void test1() {
        assertTrue(instance.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 3));
    }

    @Test
    public void test2() {
        assertFalse(instance.searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 13));
    }
}