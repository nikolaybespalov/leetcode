package com.github.nikolaybespalov.leetcode;

import java.util.HashMap;

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 */
public class A3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> table = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int v = table.getOrDefault(s.charAt(i), 0);
            table.put(s.charAt(i), v + 1);
        }

        return lengthOfLongestSubstring(s, table, 0, s.length() - 1);
    }

    public int lengthOfLongestSubstring(String s, HashMap<Character, Integer> table, int left, int right) {
        if (left > right) {
            return 0;
        }

        boolean f = false;
        int ans = 0;

        for (int i = left; i <= right; i++) {
            int v = table.get(s.charAt(i));

            if (v > 1) {
                f = true;
                break;
            } else {
                ans++;
            }
        }

        if (!f) {
            return right - left + 1;
        }

        return Math.max(lengthOfLongestSubstring(s, table, left + 1, right),
                lengthOfLongestSubstring(s, table, left, right - 1));
    }
}
