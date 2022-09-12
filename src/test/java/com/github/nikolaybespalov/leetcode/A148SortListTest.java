package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A148SortListTest {
    A148SortList instance = new A148SortList();

    @Test
    public void test1() {
        assertSameList(toListNode("1,2,3,4"), instance.sortList(toListNode("4,2,1,3")));
    }

    @Test
    public void test2() {
        assertSameList(toListNode("-1,0,3,4,5"), instance.sortList(toListNode("-1,5,3,4,0")));
    }

    @Test
    public void test3() {
        assertSameList(toListNode(""), instance.sortList(toListNode("")));
    }
}