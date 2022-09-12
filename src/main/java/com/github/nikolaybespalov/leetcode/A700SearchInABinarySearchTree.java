package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/">700. Search in a Binary Search Tree</a>
 */
public class A700SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
