package com.github.nikolaybespalov.leetcode;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
 */
public class A344ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
