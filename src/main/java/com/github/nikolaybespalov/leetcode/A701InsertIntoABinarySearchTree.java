package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/">701. Insert into a Binary Search Tree</a>
 */
public class A701InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertIntoBST2(root, val);
    }

    private TreeNode insertIntoBST2(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (node.val > val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insertIntoBST2(node.left, val);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insertIntoBST2(node.right, val);
            }
        }

        return node;
    }
}
