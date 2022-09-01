package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A88MergeSortedArrayTest {
    A88MergeSortedArray instance = new A88MergeSortedArray();

    @Test
    public void test1() {
        int[] nums1;
        int[] nums2;

        instance.merge(nums1 = new int[]{1, 2, 3, 0, 0, 0}, 3, nums2 = new int[]{2, 5, 6}, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
        assertArrayEquals(new int[]{2, 5, 6}, nums2);
    }

    @Test
    public void test2() {
        int[] nums1;
        int[] nums2;

        instance.merge(nums1 = new int[]{1}, 1, nums2 = new int[]{}, 0);

        assertArrayEquals(new int[]{1}, nums1);
        assertArrayEquals(new int[]{}, nums2);
    }

    @Test
    public void test3() {
        int[] nums1;
        int[] nums2;

        instance.merge(nums1 = new int[]{0}, 0, nums2 = new int[]{1}, 1);

        assertArrayEquals(new int[]{1}, nums1);
        assertArrayEquals(new int[]{1}, nums2);
    }

    @Test
    public void test4() {
        int[] nums1;
        int[] nums2;

        instance.merge(nums1 = new int[]{4, 5, 6, 0, 0, 0}, 3, nums2 = new int[]{1, 2, 3}, 3);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
        assertArrayEquals(new int[]{1, 2, 3}, nums2);
    }

    @Test
    public void test5() {
        int[] nums1;
        int[] nums2;

        instance.merge(nums1 = new int[]{1, 2, 3, 0, 0, 0}, 3, nums2 = new int[]{4, 5, 6}, 3);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
        assertArrayEquals(new int[]{4, 5, 6}, nums2);
    }
}