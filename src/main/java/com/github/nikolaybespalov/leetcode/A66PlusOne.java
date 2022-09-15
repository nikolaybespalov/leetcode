package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/plus-one/">66. Plus One</a>
 */
public class A66PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry > 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
