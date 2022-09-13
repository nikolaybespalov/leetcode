package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A147InsertionSortListTest {
    A147InsertionSortList instance = new A147InsertionSortList();

    @Test
    public void test1() {
        assertSameList(toListNode("1,2,3,4"), instance.insertionSortList(toListNode("4,2,1,3")));
    }

    @Test
    public void test2() {
        assertSameList(toListNode("-1,0,3,4,5"), instance.insertionSortList(toListNode("-1,5,3,4,0")));
    }
}