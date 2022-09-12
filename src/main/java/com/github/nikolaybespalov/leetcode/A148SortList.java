package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/sort-list/">148. Sort List</a>
 */
public class A148SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        return mergeLists(sortList(head), sortList(slow));
    }

    private ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                prev.next = head1;
                head1 = head1.next;
            } else {
                prev.next = head2;
                head2 = head2.next;
            }

            prev = prev.next;
        }

        if (head1 != null) {
            prev.next = head1;
        } else if (head2 != null) {
            prev.next = head2;
        }

        return head.next;
    }
}
