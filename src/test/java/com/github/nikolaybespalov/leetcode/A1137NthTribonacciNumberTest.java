package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A1137NthTribonacciNumberTest {
    A1137NthTribonacciNumber instance = new A1137NthTribonacciNumber();

    @Test
    public void test0() {
        assertEquals(0, instance.tribonacci(0));
    }

    @Test
    public void test1() {
        assertEquals(1, instance.tribonacci(1));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.tribonacci(2));
    }

    @Test
    public void test3() {
        assertEquals(2, instance.tribonacci(3));
    }

    @Test
    public void test4() {
        assertEquals(4, instance.tribonacci(4));
    }
}