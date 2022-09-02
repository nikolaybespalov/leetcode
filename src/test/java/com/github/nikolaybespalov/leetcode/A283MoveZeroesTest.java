package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A283MoveZeroesTest {
    A283MoveZeroes instance = new A283MoveZeroes();

    @Test
    public void test1() {
        int[] nums;

        instance.moveZeroes(nums = new int[]{0, 1, 0, 3, 12});

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test2() {
        int[] nums;

        instance.moveZeroes(nums = new int[]{0});

        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void test3() {
        int[] nums;

        instance.moveZeroes(nums = new int[]{1, 2, 3, 0});

        assertArrayEquals(new int[]{1, 2, 3, 0}, nums);
    }

    @Test
    public void test4() {
        int[] nums;

        instance.moveZeroes(nums = new int[]{0, 0, 1});

        assertArrayEquals(new int[]{1, 0, 0}, nums);
    }
}