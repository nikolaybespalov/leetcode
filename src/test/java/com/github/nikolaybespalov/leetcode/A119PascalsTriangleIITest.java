package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class A119PascalsTriangleIITest {
    A119PascalsTriangleII instance = new A119PascalsTriangleII();

    @Test
    public void test0() {
        assertEquals(Collections.singletonList(1), instance.getRow(0));
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 1), instance.getRow(1));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(1, 2, 1), instance.getRow(2));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(1, 3, 3, 1), instance.getRow(3));
    }

}