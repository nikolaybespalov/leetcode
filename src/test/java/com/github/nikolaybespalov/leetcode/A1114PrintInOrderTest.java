package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A1114PrintInOrderTest {
    A1114PrintInOrder instance = new A1114PrintInOrder();

    @Test
    public void test1() throws InterruptedException {
        StringBuilder sb = new StringBuilder();

        instance.first(() -> sb.append("first"));

        instance.second(() -> sb.append("second"));

        instance.third(() -> sb.append("third"));

        assertEquals("firstsecondthird", sb.toString());
    }

}