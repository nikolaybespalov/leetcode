package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
 */
public class A21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode head = new ListNode();
        ListNode ans = head;
        ListNode prev = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.val = list1.val;
                list1 = list1.next;
                prev = head;
                head = head.next = new ListNode();
            } else if (list1.val > list2.val) {
                head.val = list2.val;
                list2 = list2.next;
                prev = head;
                head = head.next = new ListNode();
            } else {
                head.val = list1.val;
                list1 = list1.next;
                head = head.next = new ListNode();

                head.val = list2.val;
                list2 = list2.next;
                prev = head;
                head = head.next = new ListNode();
            }
        }

        while (list1 != null) {
            head.val = list1.val;
            list1 = list1.next;
            prev = head;
            head = head.next = new ListNode();
        }

        while (list2 != null) {
            head.val = list2.val;
            list2 = list2.next;
            prev = head;
            head = head.next = new ListNode();
        }

        prev.next = null;

        return ans;
    }
}
