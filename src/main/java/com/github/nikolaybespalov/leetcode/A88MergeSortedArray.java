package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */
public class A88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else if (n != 0) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;

            while (i >= 0 && j >= 0 && k >= 0) {
                if (nums1[i] < nums2[j]) {
                    nums1[k--] = nums2[j--];
                } else {
                    nums1[k--] = nums1[i--];
                }
            }

            while (i >= 0 && k >= 0) {
                nums1[k--] = nums1[i--];
            }

            while (j >= 0 && k >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
