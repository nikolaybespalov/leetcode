package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">102. Binary Tree Level Order Traversal</a>
 */
public class A102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        ArrayList<TreeNode> a = new ArrayList<>();
        a.add(root);
        while (!a.isEmpty()) {
            ArrayList<TreeNode> b = new ArrayList<>();

            for (TreeNode node : a) {
                if (node.left != null) {
                    b.add(node.left);
                }
                if (node.right != null) {
                    b.add(node.right);
                }
            }

            ArrayList<Integer> asd2 = new ArrayList<>(a.size());

            for (TreeNode node : a) {
                asd2.add(node.val);
            }

            ans.add(asd2);

            a = b;
        }

        return ans;
    }
}
