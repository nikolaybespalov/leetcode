package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">387. First Unique Character in a String</a>
 */
public class A387FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] table1 = new int[26];
        int[] table2 = new int[26];
        Arrays.fill(table2, Integer.MAX_VALUE);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            table1[c - 'a']++;
            table2[c - 'a'] = Math.min(table2[c - 'a'], i);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (table1[i] == 1) {
                ans = Math.min(ans, table2[i]);
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }
}
