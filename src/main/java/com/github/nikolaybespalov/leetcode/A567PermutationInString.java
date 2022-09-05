package com.github.nikolaybespalov.leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/permutation-in-string/">567. Permutation in String</a>
 */
public class A567PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] t1 = new int[26];
        int[] t2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            t1[s1.charAt(i) - 'a']++;
            t2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(t1, t2)) {
            return true;
        }

        int w = s1.length();

        for (int i = 0; i + w < s2.length(); i++) {
            t2[s2.charAt(i) - 'a']--;
            t2[s2.charAt(i + w) - 'a']++;

            if (Arrays.equals(t1, t2)) {
                return true;
            }
        }

        return false;
    }
}
