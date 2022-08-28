package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/min-max-game/">2293. Min Max Game</a>
 */
public class A2293MinMaxGame {
    public int minMaxGame(int[] nums) {
        int n = nums.length;

        while (n > 1) {
            for (int i = 0; i < n / 2; i++) {
                int i2 = i * 2;
                int i21 = i2 + 1;

                if (i % 2 == 0) {
                    nums[i] = Math.min(nums[i2], nums[i21]);
                } else {
                    nums[i] = Math.max(nums[i2], nums[i21]);
                }
            }

            n /= 2;
        }

        return nums[0];
    }
}
