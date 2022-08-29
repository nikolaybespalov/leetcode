package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A380InsertDeleteGetRandomO1Test {
    @Test
    public void test1() {
        A380InsertDeleteGetRandomO1.RandomizedSet instance = new A380InsertDeleteGetRandomO1.RandomizedSet();

        assertFalse(instance.remove(0));
        assertFalse(instance.remove(0));
        assertTrue(instance.insert(0));
        assertEquals(0, instance.getRandom());
        assertTrue(instance.remove(0));
        assertTrue(instance.insert(0));
    }

    @Test
    public void test2() {
        A380InsertDeleteGetRandomO1.RandomizedSet instance = new A380InsertDeleteGetRandomO1.RandomizedSet();

        for (int i = 0; i < 1000000; i++) {
            assertTrue(instance.insert(i));
        }

        for (int i = 0; i < 1000000; i++) {
            assertTrue(instance.remove(instance.getRandom()));
        }

        for (int i = 0; i < 1000000; i++) {
            assertTrue(instance.insert(i));
        }
    }
}