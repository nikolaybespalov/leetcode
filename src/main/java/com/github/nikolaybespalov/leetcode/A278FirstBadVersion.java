package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/first-bad-version/">278. First Bad Version</a>
 */
public class A278FirstBadVersion {
    public int firstBadVersion(int n) {
        int startVersion = 1;
        int endVersion = n;

        while (startVersion < endVersion) {
            int midVersion = startVersion + (endVersion - startVersion) / 2;

            if (isBadVersion(midVersion)) {
                endVersion = midVersion;
            } else {
                startVersion = midVersion + 1;
            }
        }

        return startVersion;
    }

    boolean isBadVersion(int version) {
        return version >= 4;
    }
}
