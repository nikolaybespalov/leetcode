package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;
import com_github_leetcode.TreeNode;
import com_github_leetcode.left_right.Node;
import g0201_0300.s0212_word_search_ii.Tree;

import java.util.Iterator;

import static org.junit.Assert.fail;

public class LeetcodeUtils {
    public static ListNode toListNode(String input) {
        if (input.isEmpty()) {
            return null;
        }

        String[] splits = input.split(",");

        if (splits.length == 0) {
            return null;
        }

        ListNode head = new ListNode(Integer.parseInt(splits[0].trim()));
        ListNode node = head;

        for (int i = 1; i < splits.length; i++) {
            node.next = new ListNode(Integer.parseInt(splits[i].trim()));
            node = node.next;
        }

        return head;
    }

    public static TreeNode toTreeNode(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String[] splits = input.split(",");

        if (splits[0] == null || splits[0].equals("null") ) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(splits[0]));

        TreeNode[] nodes = new TreeNode[splits.length];
        nodes[0] = root;

        for (int i = 0; i < splits.length / 2; i ++) {
            TreeNode node = nodes[i];

            if (!splits[2 * i + 1].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(splits[2 * i + 1]));
                nodes[2 * i + 1] = node.left;
            }

            if (!splits[2 * i + 2].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(splits[2 * i + 2]));
                nodes[2 * i + 2] = node.right;
            }
        }

        return root;
    }

    public static void assertSameList(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                break;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        if (head1 != null || head2 != null) {
            fail("Lists are not same");
        }
    }

    public static void assertSameTree(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null && root1.val == root2.val) {
            assertSameTree(root1.left, root2.left);
            assertSameTree(root1.right, root2.right);
        } else if (root1 != null || root2 != null) {
            fail("Trees are not same");
        }
    }

    public static void assertSameTree(Node root1, Node root2) {
        if (root1 != null && root2 != null && root1.val == root2.val
                && (root1.next != null && root2.next != null && root1.next.val == root2.next.val || root1.next == null && root2.next == null)) {
            assertSameTree(root1.left, root2.left);
            assertSameTree(root1.right, root2.right);
        } else if (root1 != null || root2 != null) {
            fail("Trees are not same");
        }
    }
}
