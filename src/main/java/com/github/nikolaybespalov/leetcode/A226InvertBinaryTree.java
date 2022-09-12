package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/invert-binary-tree/">226. Invert Binary Tree</a>
 */
public class A226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invertTree2(root);

        return root;
    }

    private void invertTree2(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertTree(node.left);
        invertTree(node.right);
    }
}
