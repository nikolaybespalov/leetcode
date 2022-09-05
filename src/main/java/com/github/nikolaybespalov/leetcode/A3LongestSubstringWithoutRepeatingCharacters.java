package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 */
public class A3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] table = new int[128];
        Arrays.fill(table, -1);
        int ans = 0;

        for (int end = 0, start = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (table[c] >= start) {
                start = table[c] + 1;
            }

            table[c] = end;
            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
