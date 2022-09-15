package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a>
 */
public class A14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String ans = "";

        int j = 0;

        while (j < 200) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() == j || strs[i - 1].length() == j) {
                    return ans;
                }

                if (strs[i].charAt(j) != strs[i - 1].charAt(j)) {
                    return ans;
                }
            }

            ans = strs[0].substring(0, j + 1);

            j++;
        }

        return ans;
    }
}
