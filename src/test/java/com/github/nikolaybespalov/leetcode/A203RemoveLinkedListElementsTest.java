package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameList;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toListNode;

public class A203RemoveLinkedListElementsTest {
    A203RemoveLinkedListElements instance = new A203RemoveLinkedListElements();

    @Test
    public void test1() {
        assertSameList(toListNode("1,2,3,4,5"), instance.removeElements(toListNode("1,2,6,3,4,5,6"), 6));
    }

    @Test
    public void test2() {
        assertSameList(toListNode(""), instance.removeElements(toListNode("7,7,7,7"), 7));
    }
}