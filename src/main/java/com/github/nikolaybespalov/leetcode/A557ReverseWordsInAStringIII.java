package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>
 */
public class A557ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        char[] ca = s.toCharArray();

        int i = 0;
        for (int j = 0; j <= ca.length; j++) {
            if (j == ca.length || ca[j] == ' ') {
                for (int k = i; k < i + (j - i) / 2; k++) {
                    char temp = ca[k];
                    ca[k] = ca[i + j - k - 1];
                    ca[i + j - k - 1] = temp;
                }
                i = j + 1;
            }
        }

        return new String(ca);
    }
}
