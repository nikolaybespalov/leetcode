package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A232ImplementQueueUsingStacksTest {
    @Test
    public void test1() {
        A232ImplementQueueUsingStacks.MyQueue instance = new A232ImplementQueueUsingStacks.MyQueue();

        instance.push(1);
        instance.push(2);
        assertEquals(1, instance.peek());
        assertEquals(1, instance.pop());
        assertFalse(instance.empty());
    }

    @Test
    public void test2() {
        A232ImplementQueueUsingStacks.MyQueue instance = new A232ImplementQueueUsingStacks.MyQueue();

        instance.push(1);
        instance.push(2);
        instance.push(3);
        instance.push(4);
        instance.push(5);
        assertEquals(1, instance.pop());
        assertEquals(2, instance.pop());
        assertEquals(3, instance.pop());
        assertEquals(4, instance.pop());
        assertEquals(5, instance.pop());
        assertTrue(instance.empty());
    }
}