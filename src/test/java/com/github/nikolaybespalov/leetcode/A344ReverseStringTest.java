package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A344ReverseStringTest {
    A344ReverseString instance = new A344ReverseString();

    @Test
    public void test1() {
        char[] s = "hello".toCharArray();
        instance.reverseString(s);

        assertArrayEquals("olleh".toCharArray(), s);
    }

    @Test
    public void test2() {
        char[] s = "Hannah".toCharArray();
        instance.reverseString(s);

        assertArrayEquals("hannaH".toCharArray(), s);
    }
}