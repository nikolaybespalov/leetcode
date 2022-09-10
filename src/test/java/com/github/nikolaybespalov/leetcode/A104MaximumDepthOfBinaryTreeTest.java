package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toTreeNode;
import static org.junit.Assert.assertEquals;

public class A104MaximumDepthOfBinaryTreeTest {
    A104MaximumDepthOfBinaryTree instance = new A104MaximumDepthOfBinaryTree();

    @Test
    public void test1() {
        assertEquals(3, instance.maxDepth(toTreeNode("3,9,20,null,null,15,7")));
    }

    @Test
    public void test2() {
        assertEquals(2, instance.maxDepth(toTreeNode("1,null,2")));
    }
}