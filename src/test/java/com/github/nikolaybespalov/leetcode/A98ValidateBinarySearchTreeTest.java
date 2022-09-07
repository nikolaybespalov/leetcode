package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A98ValidateBinarySearchTreeTest {
    A98ValidateBinarySearchTree instance = new A98ValidateBinarySearchTree();

    @Test
    public void test1() {
        TreeNode tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);

        assertTrue(instance.isValidBST(tree));
    }

    @Test
    public void test2() {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.right.left = new TreeNode(3);
        tree.right.right = new TreeNode(6);

        assertFalse(instance.isValidBST(tree));
    }

    @Test
    public void test3() {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(6);
        tree.right.left = new TreeNode(3);
        tree.right.right = new TreeNode(7);

        assertFalse(instance.isValidBST(tree));
    }
}