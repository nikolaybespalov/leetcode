package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/">647. Palindromic Substrings</>
 */
public class A647PalindromicSubstrings {
    public int countSubstrings(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if (isPalindrome(s, i, j)) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private boolean isPalindrome(String s, int i, int j) {
        int n = j - i;

        for (int i1 = 0; i1 < n / 2; i1++) {
            if (s.charAt(i1 + i) != s.charAt(j - i1 - 1)) {
                return false;
            }
        }

        return true;
    }
}
