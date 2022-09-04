package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/longest-palindrome/">409. Longest Palindrome</a>
 */
public class A409LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] set = new char[52];

        int ans = 0;
        int t = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = indexFor(c);
            if (set[index] == 1) {
                ans += 2;
                set[index] = 0;
                t--;
            } else {
                set[index] = 1;
                t++;
            }
        }

        if (t > 0) {
            ans++;
        }

        return ans;
    }

    private int indexFor(char c ) {
        return c >= 'a' && c <= 'z' ? c - 'a' : c - 'A' + 26;
    }
}
