package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">101. Symmetric Tree</a>
 */
public class A101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isEquals(root.left, root.right);
    }

    private boolean isEquals(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left != null && right != null && left.val == right.val) {
            return isEquals(left.left, right.right) && isEquals(left.right, right.left);
        }

        return false;
    }
}
