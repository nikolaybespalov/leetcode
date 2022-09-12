package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A198HouseRobberTest {
    A198HouseRobber instance = new A198HouseRobber();

    @Test
    public void test1() {
        assertEquals(4, instance.rob(new int[]{
                1, 2, 3, 1
        }));
    }

    @Test
    public void test2() {
        assertEquals(12, instance.rob(new int[]{
                2, 7, 9, 3, 1
        }));
    }
}