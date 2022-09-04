package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A19RemoveNthNodeFromEndOfListTest {
    A19RemoveNthNodeFromEndOfList instance = new A19RemoveNthNodeFromEndOfList();

    @Test
    public void test1() {
        assertSameList(toListNode("1,2,3,5"),
                instance.removeNthFromEnd(toListNode("1,2,3,4,5"), 2));
    }

    @Test
    public void test2() {
        assertSameList(toListNode(""),
                instance.removeNthFromEnd(toListNode("1"), 1));
    }

    @Test
    public void test3() {
        assertSameList(toListNode("2,3,4,5"),
                instance.removeNthFromEnd(toListNode("1,2,3,4,5"), 5));
    }

    @Test
    public void test4() {
        assertSameList(toListNode("1"),
                instance.removeNthFromEnd(toListNode("1,2"), 1));
    }
}