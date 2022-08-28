package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/maximum-69-number/">1323. Maximum 69 Number</a>
 */
public class A1323Maximum69Number {
    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '6') {
                a[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(a));
    }
}
