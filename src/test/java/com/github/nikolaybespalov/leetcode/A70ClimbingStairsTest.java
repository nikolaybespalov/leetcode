package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A70ClimbingStairsTest {
    A70ClimbingStairs instance = new A70ClimbingStairs();

    @Test
    public void test0() {
        assertEquals(0, instance.climbStairs(0));
    }

    @Test
    public void test1() {
        assertEquals(1, instance.climbStairs(1));
    }

    @Test
    public void test2() {
        assertEquals(2, instance.climbStairs(2));
    }

    @Test
    public void test3() {
        assertEquals(3, instance.climbStairs(3));
    }

    @Test
    public void test4() {
        assertEquals(5, instance.climbStairs(4));
    }

    @Test
    public void test5() {
        assertEquals(8, instance.climbStairs(5));
    }

    @Test
    public void test6() {
        assertEquals(13, instance.climbStairs(6));
    }

    @Test
    public void test44() {
        assertEquals(1134903170, instance.climbStairs(44));
    }

    @Test
    public void test45() {
        assertEquals(1836311903, instance.climbStairs(45));
    }
}