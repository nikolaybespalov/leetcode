package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 */
public class A19RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);

        head = removeNth(head, n);

        return reverse(head);
    }

    private ListNode removeNth(ListNode head, int n) {
        ListNode prev = null;
        int i = 1;
        for (ListNode node = head; node != null; node = node.next, i++) {
            if (n - i == 0) {
                if (prev != null) {
                    prev.next = node.next;
                } else {
                    node = node.next;
                    head = node;
                }

                break;
            }
            prev = node;
        }

        return head;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
