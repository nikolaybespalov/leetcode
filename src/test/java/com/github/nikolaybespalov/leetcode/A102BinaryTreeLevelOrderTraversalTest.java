package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class A102BinaryTreeLevelOrderTraversalTest {
    A102BinaryTreeLevelOrderTraversal instance = new A102BinaryTreeLevelOrderTraversal();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(Arrays.asList(
                Collections.singletonList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        ), instance.levelOrder(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);

        assertEquals(Collections.singletonList(
                Collections.singletonList(1)
        ), instance.levelOrder(root));
    }

    @Test
    public void test3() {
        TreeNode root = null;

        assertEquals(Collections.emptyList(), instance.levelOrder(root));
    }
}