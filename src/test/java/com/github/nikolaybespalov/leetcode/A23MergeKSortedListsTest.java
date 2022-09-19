package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;
import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A23MergeKSortedListsTest {
    A23MergeKSortedLists instance = new A23MergeKSortedLists();

    @Test
    public void test1() {
        assertSameList(toListNode("1,1,2,3,4,4,5,6"), instance.mergeKLists(new ListNode[]{
                toListNode("1,4,5"),
                toListNode("1,3,4"),
                toListNode("2,6")
        }));
    }

    @Test
    public void test2() {
        assertSameList(toListNode(""), instance.mergeKLists(new ListNode[]{}));
    }

    @Test
    public void test3() {
        assertSameList(toListNode(""), instance.mergeKLists(new ListNode[]{null}));
    }
}