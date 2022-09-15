package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a>
 */
public class A169MajorityElement {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                ans = nums[i];
                count++;
            } else if (ans == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return ans;
    }
}
