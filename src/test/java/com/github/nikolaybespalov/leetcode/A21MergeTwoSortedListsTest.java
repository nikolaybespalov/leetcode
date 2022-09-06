package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A21MergeTwoSortedListsTest {
    A21MergeTwoSortedLists instance = new A21MergeTwoSortedLists();

    @Test
    public void test1() {
        assertSameList(toListNode("1,1,2,3,4,4"),
                instance.mergeTwoLists(toListNode("1,2,4"),
                        toListNode("1,3,4")));
    }

    @Test
    public void test2() {
        assertSameList(toListNode("0"),
                instance.mergeTwoLists(toListNode(""),
                        toListNode("0")));
    }

    @Test
    public void test3() {
        assertSameList(toListNode(""),
                instance.mergeTwoLists(toListNode(""),
                        toListNode("")));
    }

    @Test
    public void test4() {
        assertSameList(toListNode("1"),
                instance.mergeTwoLists(toListNode("1"),
                        toListNode("")));
    }

    @Test
    public void test5() {
        assertSameList(toListNode("1,2,3,4,5,6"),
                instance.mergeTwoLists(toListNode("1,2,3"),
                        toListNode("4,5,6")));
    }

    @Test
    public void test6() {
        assertSameList(toListNode("1,2,3,4,5,6"),
                instance.mergeTwoLists(toListNode("4,5,6"),
                        toListNode("1,2,3")));
    }
}