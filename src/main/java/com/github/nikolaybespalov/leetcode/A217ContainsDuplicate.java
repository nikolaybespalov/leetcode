package com.github.nikolaybespalov.leetcode;

import java.util.HashMap;

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">217. Contains Duplicate</a>
 */
public class A217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }

            map.put(num,  1);
        }

        return false;
    }
}
