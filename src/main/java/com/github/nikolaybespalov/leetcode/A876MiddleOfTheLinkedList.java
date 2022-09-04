package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 */
public class A876MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode newHead = head;

        int n = 0;

        while (newHead != null) {
            newHead = newHead.next;
            n++;
        }

        newHead = head;

        for (int i = 0; i < n / 2; i++) {
            newHead = newHead.next;
        }

        return newHead;
    }
}
