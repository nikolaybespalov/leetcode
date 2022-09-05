package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a>
 */
public class A242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] t1 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            t1[s.charAt(i) - 'a']++;
        }

        int[] t2 = new int[26];

        for (int i = 0; i < t.length(); i++) {
            t2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (t1[i] != t2[i]) {
                return false;
            }
        }

        return true;
    }
}
