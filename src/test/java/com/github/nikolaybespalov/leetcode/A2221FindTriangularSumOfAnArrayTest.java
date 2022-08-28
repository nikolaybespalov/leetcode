package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A2221FindTriangularSumOfAnArrayTest {
    A2221FindTriangularSumOfAnArray instance = new A2221FindTriangularSumOfAnArray();

    @Test
    public void test1() {
        assertEquals(8, instance.triangularSum(new int[]{
                1, 2, 3, 4, 5
        }));
    }

    @Test
    public void test2() {
        assertEquals(5, instance.triangularSum(new int[]{
                5
        }));
    }
}