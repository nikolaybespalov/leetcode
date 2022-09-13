package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/sort-an-array/">912. Sort an Array</a>
 */
public class A912SortAnArray {
    public int[] sortArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (max - min < nums.length) {
            countingSort(nums, min, max);
        } else {
            heapSort(nums);
        }

        return nums;
    }

    private void countingSort(int[] nums, int min, int max) {
        int[] table = new int[max - min + 1];

        for (int num : nums) {
            table[num - min]++;
        }

        int k = 0;

        for (int i = 0; i < table.length; i++) {
            while(table[i] > 0) {
                nums[k++] = i + min;
                table[i]--;
            }
        }
    }

    private void heapSort(int[] nums) {
        int n = nums.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(nums, n, i);

        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);

            heapify(nums, i, 0);
        }
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && nums[left] > nums[largest])
            largest = left;

        if (right < n && nums[right] > nums[largest])
            largest = right;

        if (largest != i) {
            swap(nums, i, largest);

            heapify(nums, n, largest);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
