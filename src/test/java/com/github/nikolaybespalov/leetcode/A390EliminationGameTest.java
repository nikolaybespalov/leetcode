package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A390EliminationGameTest {
    A390EliminationGame instance = new A390EliminationGame();

    @Test
    public void test1() {
        assertEquals(1, instance.lastRemaining(1));
    }

    @Test
    public void test6() {
        assertEquals(4, instance.lastRemaining(6));
    }

    @Test
    public void test9() {
        assertEquals(6, instance.lastRemaining(9));
    }

    @Test
    public void test21() {
        assertEquals(6, instance.lastRemaining(21));
    }
}