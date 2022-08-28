package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A2293MinMaxGameTest {
    A2293MinMaxGame instance = new A2293MinMaxGame();

    @Test
    public void test1() {
        assertEquals(1, instance.minMaxGame(new int[]{
                1, 3, 5, 2, 4, 8, 2, 2
        }));
    }

    @Test
    public void test2() {
        assertEquals(3, instance.minMaxGame(new int[]{
                3
        }));
    }

    @Test
    public void test3() {
        assertEquals(1, instance.minMaxGame(new int[]{
                1, 2, 3, 4
        }));
    }

    @Test
    public void test4() {
        assertEquals(4, instance.minMaxGame(new int[]{
                8, 8, 3, 4, 5, 6, 7, 8
        }));
    }

}