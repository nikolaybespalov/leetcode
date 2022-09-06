package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">203. Remove Linked List Elements</a>
 */
public class A203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode ans = head;

        while (head != null) {
            if (head.val == val) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    ans = head.next;
                }
            } else {
                prev = head;
            }

            head = head.next;
        }

        return ans;
    }
}
