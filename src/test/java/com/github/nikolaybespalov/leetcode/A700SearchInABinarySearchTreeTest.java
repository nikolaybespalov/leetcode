package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameTree;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toTreeNode;

public class A700SearchInABinarySearchTreeTest {
    A700SearchInABinarySearchTree instance = new A700SearchInABinarySearchTree();

    @Test
    public void test1() {
        assertSameTree(toTreeNode("2,1,3"), instance.searchBST(toTreeNode("4,2,7,1,3"), 2));
    }

    @Test
    public void test2() {
        assertSameTree(toTreeNode(""), instance.searchBST(toTreeNode("4,2,7,1,3"), 5));
    }
}