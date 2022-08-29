package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A1025DivisorGameTest {
    A1025DivisorGame instance = new A1025DivisorGame();

    @Test
    public void test1() {
        assertFalse(instance.divisorGame(1));
    }

    @Test
    public void test2() {
        assertTrue(instance.divisorGame(2));
    }

    @Test
    public void test3() {
        assertFalse(instance.divisorGame(3));
    }
}