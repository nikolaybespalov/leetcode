package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/insertion-sort-list/">147. Insertion Sort List</a>
 */
public class A147InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;

            sorted = sortedInsert(sorted, cur);

            cur = next;
        }

        return sorted;
    }

    private ListNode sortedInsert(ListNode sorted, ListNode node) {
        if (sorted == null || sorted.val > node.val) {
            node.next = sorted;
            sorted = node;
        } else {
            ListNode cur = sorted;

            while (cur.next != null && cur.next.val <= node.val) {
                cur = cur.next;
            }

            node.next = cur.next;
            cur.next = node;
        }

        return sorted;
    }
}
