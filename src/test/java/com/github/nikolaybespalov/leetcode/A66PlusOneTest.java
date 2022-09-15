package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A66PlusOneTest {
    A66PlusOne instance = new A66PlusOne();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{
                1, 2, 4
        }, instance.plusOne(new int[]{
                1, 2, 3
        }));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{
                4, 3, 2, 2
        }, instance.plusOne(new int[]{
                4, 3, 2, 1
        }));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{
                1, 0
        }, instance.plusOne(new int[]{
                9
        }));
    }
}