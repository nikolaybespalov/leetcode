package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class A120TriangleTest {
    A120Triangle instance = new A120Triangle();

    @Test
    public void test1() {
        assertEquals(11, instance.minimumTotal(Arrays.asList(
                Collections.singletonList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        )));
    }

    @Test
    public void test2() {
        assertEquals(-10, instance.minimumTotal(Collections.singletonList(
                Collections.singletonList(-10)
        )));
    }
}