package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A509FibonacciNumberTest {
    A509FibonacciNumber instance = new A509FibonacciNumber();

    @Test
    public void test0() {
        assertEquals(0, instance.fib(0));
    }

    @Test
    public void test1() {
        assertEquals(1, instance.fib(1));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.fib(2));
    }

    @Test
    public void test3() {
        assertEquals(2, instance.fib(3));
    }

    @Test
    public void test4() {
        assertEquals(3, instance.fib(4));
    }

    @Test
    public void test1000() {
        assertEquals(1556111435, instance.fib(1000));
    }
}