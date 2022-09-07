package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A83RemoveDuplicatesFromSortedListTest {
    A83RemoveDuplicatesFromSortedList instance = new A83RemoveDuplicatesFromSortedList();

    @Test
    public void test1() {
        assertSameList(toListNode("1,2"), instance.deleteDuplicates(toListNode("1,1,2")));
    }

    @Test
    public void test2() {
        assertSameList(toListNode("1,2,3"), instance.deleteDuplicates(toListNode("1,1,2,3,3")));
    }
}