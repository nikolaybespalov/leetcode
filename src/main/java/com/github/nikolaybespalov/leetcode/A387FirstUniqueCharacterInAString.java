package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">387. First Unique Character in a String</a>
 */
public class A387FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] table1 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            table1[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (table1[c - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
