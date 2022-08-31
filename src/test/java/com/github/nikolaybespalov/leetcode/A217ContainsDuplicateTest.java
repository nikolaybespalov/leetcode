package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A217ContainsDuplicateTest {
    A217ContainsDuplicate instance = new A217ContainsDuplicate();

    @Test
    public void test1() {
        assertTrue(instance.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertFalse(instance.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        assertTrue(instance.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}