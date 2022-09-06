package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A141LinkedListCycleTest {
    A141LinkedListCycle instance = new A141LinkedListCycle();

    @Test
    public void test1() {
        ListNode list = new ListNode(3);
        list.next = new ListNode(2);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = list.next;

        assertTrue(instance.hasCycle(list));
    }

    @Test
    public void test2() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = list;

        assertTrue(instance.hasCycle(list));
    }

    @Test
    public void test3() {
        ListNode list = new ListNode(1);

        assertFalse(instance.hasCycle(list));
    }

    @Test
    public void test4() {
        ListNode list = new ListNode(1);
        list.next = list;

        assertTrue(instance.hasCycle(list));
    }
}