package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;
import com_github_leetcode.TreeNode;

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
}
