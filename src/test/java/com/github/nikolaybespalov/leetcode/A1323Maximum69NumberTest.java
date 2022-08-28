package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A1323Maximum69NumberTest {
    A1323Maximum69Number instance = new A1323Maximum69Number();

    @Test
    public void test1() {
        assertEquals(9969, instance.maximum69Number(9669));
    }

    @Test
    public void test2() {
        assertEquals(9999, instance.maximum69Number(9996));
    }

    @Test
    public void test3() {
        assertEquals(9999, instance.maximum69Number(9999));
    }
}