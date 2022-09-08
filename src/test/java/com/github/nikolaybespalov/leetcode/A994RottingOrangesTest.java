package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A994RottingOrangesTest {
    A994RottingOranges instance = new A994RottingOranges();

    @Test
    public void test1() {
        assertEquals(4, instance.orangesRotting(new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        }));
    }

    @Test
    public void test2() {
        assertEquals(-1, instance.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        }));
    }

    @Test
    public void test3() {
        assertEquals(0, instance.orangesRotting(new int[][]{
                {0, 2}
        }));
    }
}