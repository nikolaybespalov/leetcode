package com.github.nikolaybespalov.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */
public class A350IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        int[] map = new int[1001];

        for (int j : nums1) {
            map[j]++;
        }

        int i = 0;

        for (int k : nums2) {
            if (map[k]-- > 0) {
                nums1[i++] = k;
            }
        }

        if (i == nums1.length) {
            return nums1;
        }

        return Arrays.copyOf(nums1, i);
    }
}
