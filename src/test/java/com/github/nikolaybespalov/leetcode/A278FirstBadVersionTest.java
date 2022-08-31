package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A278FirstBadVersionTest {
    A278FirstBadVersion instance = new A278FirstBadVersion();

    @Test
    public void test1() {
        assertEquals(4, instance.firstBadVersion(5));
    }
}