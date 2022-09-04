package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class A142LinkedListCycleIITest {
    A142LinkedListCycleII instance = new A142LinkedListCycleII();

    @Test
    public void test1() {
        ListNode list = new ListNode(3);
        list.next = new ListNode(2);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(-4);
        list.next.next.next.next = list.next;

        assertEquals(list.next, instance.detectCycle(list));
    }

    @Test
    public void test2() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next = list;

        assertEquals(list, instance.detectCycle(list));
    }

    @Test
    public void test3() {
        ListNode list = new ListNode(1);

        assertNull(instance.detectCycle(list));
    }

    @Test
    public void test4() {
        ListNode list = new ListNode(1);
        list.next = list;

        assertEquals(list, instance.detectCycle(list));
    }
}