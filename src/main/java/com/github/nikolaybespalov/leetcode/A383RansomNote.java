package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/ransom-note/">383. Ransom Note</a>
 */
public class A383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] t1 = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            t1[ransomNote.charAt(i) - 'a']++;
        }

        int[] t2 = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            t2[magazine.charAt(i) - 'a']++;
        }

        int ans = ransomNote.length();

        for (int i = 0; i < 26; i++) {
            if (t1[i] != 0 && t1[i] <= t2[i]) {
                ans -= t1[i];
            }
        }

        return ans == 0;
    }
}
