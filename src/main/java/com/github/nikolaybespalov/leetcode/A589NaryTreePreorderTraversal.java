package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">589. N-ary Tree Preorder Traversal</a>
 */
public class A589NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }

    private void preorder(Node root, List<Integer> ans) {
        if (root != null) {
            ans.add(root.val);

            for (Node child : root.neighbors) {
                preorder(child, ans);
            }
        }
    }
}
