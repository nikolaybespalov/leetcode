package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A191NumberOf1BitsTest {
    A191NumberOf1Bits instance = new A191NumberOf1Bits();

    @Test
    public void test1() {
        assertEquals(3, instance.hammingWeight(11));
    }

    @Test
    public void test2() {
        assertEquals(1, instance.hammingWeight(128));
    }

}