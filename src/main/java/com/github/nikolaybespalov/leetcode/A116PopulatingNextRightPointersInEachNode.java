package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.left_right.Node;

/**
 * @see <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/">116. Populating Next Right Pointers in Each Node</a>
 */
public class A116PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        bfs(root);

        return root;
    }

    private void bfs(Node root) {
        if (root == null || root.left == null || root.right == null) {
            return;
        }

        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }

        bfs(root.left);
        bfs(root.right);
    }
}
