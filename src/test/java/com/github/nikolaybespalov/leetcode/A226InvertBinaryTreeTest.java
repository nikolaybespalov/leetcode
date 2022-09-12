package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameTree;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toTreeNode;

public class A226InvertBinaryTreeTest {
    A226InvertBinaryTree instance = new A226InvertBinaryTree();

    @Test
    public void test1() {
        assertSameTree(toTreeNode("4,7,2,9,6,3,1"), instance.invertTree(toTreeNode("4,2,7,1,3,6,9")));
    }

    @Test
    public void test2() {
        assertSameTree(toTreeNode("2,3,1"), instance.invertTree(toTreeNode("2,1,3")));
    }

    @Test
    public void test3() {
        assertSameTree(toTreeNode(""), instance.invertTree(toTreeNode("")));
    }
}