package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">235. Lowest Common Ancestor of a Binary Search Tree</a>
 */
public class A235LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
