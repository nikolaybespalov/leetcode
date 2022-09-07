package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/merge-two-binary-trees/">617. Merge Two Binary Trees</a>
 */
public class A617MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }

        mergeTrees2(root1, root2);

        return root1;
    }

    private void mergeTrees2(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return;
        }

        root1.val += root2.val;

        if (root1.left == null) {
            root1.left = root2.left;
        } else {
            mergeTrees2(root1.left, root2.left);
        }

        if (root1.right == null) {
            root1.right = root2.right;
        } else {
            mergeTrees2(root1.right, root2.right);
        }

    }
}
