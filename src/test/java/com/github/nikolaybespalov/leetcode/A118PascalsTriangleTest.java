package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class A118PascalsTriangleTest {
    A118PascalsTriangle instance = new A118PascalsTriangle();

    @Test
    public void test1() {
        assertEquals(Collections.singletonList(Collections.singletonList(1)), instance.generate(1));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)), instance.generate(5));
    }

}