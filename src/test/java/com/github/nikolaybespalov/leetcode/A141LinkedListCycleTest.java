package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class A141LinkedListCycleTest {
    A141LinkedListCycle instance = new A141LinkedListCycle();

    @Test
    public void test1() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(3);
        list.next = new A141LinkedListCycle.ListNode(2);
        list.next.next = new A141LinkedListCycle.ListNode(0);
        list.next.next.next = new A141LinkedListCycle.ListNode(4);
        list.next.next.next.next = list.next;

        assertTrue(instance.hasCycle(list));
    }

    @Test
    public void test2() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(1);
        list.next = new A141LinkedListCycle.ListNode(2);
        list.next.next = list;

        assertTrue(instance.hasCycle(list));
    }

    @Test
    public void test3() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(1);

        assertFalse(instance.hasCycle(list));
    }

    @Test
    public void test4() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(1);
        list.next = list;

        assertTrue(instance.hasCycle(list));
    }
}