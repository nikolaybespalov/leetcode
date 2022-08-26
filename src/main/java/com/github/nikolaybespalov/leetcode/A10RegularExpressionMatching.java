package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/">10. Regular Expression Matching</a>
 */
public class A10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int matched = 0;

        boolean starFound = false;
        char starChar = 0;

        while (i < s.length() && j < p.length()) {
            char currentPatternChar = p.charAt(j);

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                starFound = true;
                starChar = p.charAt(j);
            } else {
                starFound = false;
                starChar = 0;
            }

            if (starFound && isMatch(s.charAt(i), starChar)) {
                i++;
                j += 2;
                matched++;
            } else if (isMatch(s.charAt(i), currentPatternChar)) {
                i++;
                j++;
                matched++;
            } else {
                i++;
                j++;
            }
        }

        return matched == s.length() && j == p.length();
    }

//    public boolean isMatch(String s, String p) {
//        int i = 0;
//        int j = 0;
//
//        while (i < s.length()) {
//            int j2 = -1;
//            boolean f = false;
//            while (j < p.length()) {
//                char c = p.charAt(j);
//
//                if (j != j2 && j + 1 < p.length() && p.charAt(j + 1) == '*') {
//                    j2 = j;
//                } else {
//                    if (!f) {
//                        j++;
//                    }
//                }
//
//                if (isMatch(s.charAt(i), c) || j2 == j) {
//                    if (!isMatch(s.charAt(i), c)) {
//                        f = true;
//                    }
//
//                    i++;
//                }
//
//                if (i == s.length()) {
//                    if (j2 > -1) {
//                        return j2 == p.length() - 2 || j == p.length() || j == j2 && !f;
//                    }
//
//                    return j == p.length();
//                }
//
//                if (j == p.length() && i < s.length()) {
//                    return false;
//                }
//            }
//        }
//
//        return false;
//    }

    private boolean isMatch(char a, char b) {
        return a == b || b == '.';
    }
}
