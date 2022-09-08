package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A200NumberOfIslandsTest {
    A200NumberOfIslands instance = new A200NumberOfIslands();

    @Test
    public void test1() {
        assertEquals(1, instance.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        }));
    }

    @Test
    public void test2() {
        assertEquals(3, instance.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        }));
    }
}