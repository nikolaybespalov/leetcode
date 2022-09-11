package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A62UniquePathsTest {
    A62UniquePaths instance = new A62UniquePaths();

    @Test
    public void test1() {
        assertEquals(28, instance.uniquePaths(3, 7));
    }

    @Test
    public void test2() {
        assertEquals(3, instance.uniquePaths(3, 2));
    }

    @Test
    public void test3() {
        assertEquals(989224732, instance.uniquePaths(25, 25));
    }
}