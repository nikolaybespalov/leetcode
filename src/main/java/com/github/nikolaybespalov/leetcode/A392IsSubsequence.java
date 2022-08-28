package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>
 */
public class A392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int ans = 0;

        for (; i < s.length(); i++) {
            for (; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    ans++;
                    j++;
                    break;
                }
            }
        }

        return i == s.length() && ans == s.length();
    }
}
