package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A189RotateArrayTest {
    A189RotateArray instance = new A189RotateArray();

    @Test
    public void test1() {
        int[] nums;

        instance.rotate(nums = new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    public void test2() {
        int[] nums;

        instance.rotate(nums = new int[]{-1, -100, 3, 99}, 2);

        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

    @Test
    public void test3() {
        int[] nums;

        instance.rotate(nums = new int[]{-1, -100, 3, 99, 1}, 2);

        assertArrayEquals(new int[]{99, 1, -1, -100, 3}, nums);
    }
}