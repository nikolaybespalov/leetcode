package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A876MiddleOfTheLinkedListTest {
    A876MiddleOfTheLinkedList instance = new A876MiddleOfTheLinkedList();

    @Test
    public void test1() {
        assertSameList(toListNode("3,4,5"), instance.middleNode(toListNode("1,2,3,4,5")));
    }

    @Test
    public void test2() {
        assertSameList(toListNode("4,5,6"), instance.middleNode(toListNode("1,2,3,4,5,6")));
    }
}