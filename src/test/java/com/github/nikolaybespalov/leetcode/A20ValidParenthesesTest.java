package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A20ValidParenthesesTest {
    A20ValidParentheses instance = new A20ValidParentheses();

    @Test
    public void test1() {
        assertTrue(instance.isValid("()"));
    }

    @Test
    public void test2() {
        assertTrue(instance.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        assertFalse(instance.isValid("(]"));
    }

    @Test
    public void test4() {
        assertFalse(instance.isValid("]"));
    }

    @Test
    public void test5() {
        assertFalse(instance.isValid("]()"));
    }
}