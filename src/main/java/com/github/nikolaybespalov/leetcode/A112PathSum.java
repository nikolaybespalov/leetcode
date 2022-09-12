package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/path-sum/">112. Path Sum</a>
 */
public class A112PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
