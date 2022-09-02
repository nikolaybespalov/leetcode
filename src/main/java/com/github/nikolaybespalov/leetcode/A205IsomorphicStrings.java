package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/isomorphic-strings/">205. Isomorphic Strings</a>
 */
public class A205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[128];
        int[] map2 = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] != 0 && map1[c1] != c2
                    || map2[c2] != 0 && map2[c2] != c1) {
                return false;
            } else {
                map1[c1] = c2;
                map2[c2] = c1;
            }
        }

        return true;
    }
}
