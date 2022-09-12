package com.github.nikolaybespalov.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/">438. Find All Anagrams in a String</a>
 */
public class A438FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) {
            return ans;
        }

        int[] fS = new int[26];
        int[] fP = new int[26];

        for (int i = 0; i < m; i++) {
            fS[s.charAt(i) - 'a']++;
            fP[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= n - m; i++) {
            if (Arrays.equals(fS, fP)) {
                ans.add(i);
            }

            fS[s.charAt(i) - 'a']--;

            if (i + m < n) {
                fS[s.charAt(i + m) - 'a']++;
            }
        }

        return ans;
    }
}
