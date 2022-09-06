package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
 */
public class A21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev = new ListNode(0);
        ListNode ans = prev;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }

            prev = prev.next;
        }

        if (list1 != null) {
            prev.next = list1;
        } else if (list2 != null) {
            prev.next = list2;
        }

        return ans.next;
    }
}
