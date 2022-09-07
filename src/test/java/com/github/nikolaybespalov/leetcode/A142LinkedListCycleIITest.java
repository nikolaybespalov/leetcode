package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class A142LinkedListCycleIITest {
    A142LinkedListCycleII instance = new A142LinkedListCycleII();

    @Test
    public void test1() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(3);
        list.next = new A141LinkedListCycle.ListNode(2);
        list.next.next = new A141LinkedListCycle.ListNode(0);
        list.next.next.next = new A141LinkedListCycle.ListNode(-4);
        list.next.next.next.next = list.next;

        assertEquals(list.next, instance.detectCycle(list));
    }

    @Test
    public void test2() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(1);
        list.next = new A141LinkedListCycle.ListNode(1);
        list.next = list;

        assertEquals(list, instance.detectCycle(list));
    }

    @Test
    public void test3() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(1);

        assertNull(instance.detectCycle(list));
    }

    @Test
    public void test4() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(1);
        list.next = list;

        assertEquals(list, instance.detectCycle(list));
    }

    @Test
    public void test5() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(3);
        list.next = new A141LinkedListCycle.ListNode(2);
        list.next.next = new A141LinkedListCycle.ListNode(0);
        list.next.next.next = new A141LinkedListCycle.ListNode(-4);
        list.next.next.next.next = list.next.next.next;

        assertEquals(list.next.next.next, instance.detectCycle(list));
    }

    @Test
    public void test6() {
        A141LinkedListCycle.ListNode list = new A141LinkedListCycle.ListNode(3);
        list.next = new A141LinkedListCycle.ListNode(2);
        list.next.next = new A141LinkedListCycle.ListNode(0);
        list.next.next.next = new A141LinkedListCycle.ListNode(-4);
        list.next.next.next.next = list;

        assertEquals(list, instance.detectCycle(list));
    }
}