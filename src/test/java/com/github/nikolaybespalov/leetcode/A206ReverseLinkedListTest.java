package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A206ReverseLinkedListTest {
    A206ReverseLinkedList instance = new A206ReverseLinkedList();

    @Test
    public void test1() {
        assertSameList(toListNode("5,4,3,2,1"),
                instance.reverseList(toListNode("1,2,3,4,5")));
    }

    @Test
    public void test2() {
        assertSameList(toListNode("2,1"),
                instance.reverseList(toListNode("1,2")));
    }

    @Test
    public void test3() {
        assertSameList(toListNode(""),
                instance.reverseList(toListNode("")));
    }
}