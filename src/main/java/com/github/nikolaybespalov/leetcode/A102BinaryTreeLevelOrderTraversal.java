package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">102. Binary Tree Level Order Traversal</a>
 */
public class A102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> valuesAtLevel = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; ++i) {
                TreeNode n = queue.poll();
                assert n != null;
                valuesAtLevel.add(n.val);

                if (n.left != null)
                    queue.add(n.left);

                if (n.right != null)
                    queue.add(n.right);
            }

            ans.add(valuesAtLevel);
        }

        return ans;
    }
}
