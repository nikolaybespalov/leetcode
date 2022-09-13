package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/insertion-sort-list/">147. Insertion Sort List</a>
 */
public class A147InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        for (ListNode i = head; i != null; i = i.next) {
            for (ListNode j = head; j.next != null; j = j.next) {
                if (j.val > j.next.val) {
                    int temp = j.val;
                    j.val = j.next.val;
                    j.next.val = temp;
                }
            }
        }

        return head;
    }
}
