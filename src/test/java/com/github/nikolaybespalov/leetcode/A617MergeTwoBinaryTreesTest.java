package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;
import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.*;

public class A617MergeTwoBinaryTreesTest {
    A617MergeTwoBinaryTrees instance = new A617MergeTwoBinaryTrees();

    @Test
    public void test1() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(4);
        expected.right = new TreeNode(5);
        expected.left.left = new TreeNode(5);
        expected.left.right = new TreeNode(4);
        expected.right.right = new TreeNode(7);

        assertSameTree(expected, instance.mergeTrees(root1, root2));
    }

    @Test
    public void test2() {
        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        TreeNode expected = new TreeNode(2);
        expected.left = new TreeNode(2);

        assertSameTree(expected, instance.mergeTrees(root1, root2));
    }
}