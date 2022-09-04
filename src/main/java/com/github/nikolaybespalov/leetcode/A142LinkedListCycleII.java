package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle-ii/">142. Linked List Cycle II</a>
 */
public class A142LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                fast = head;

                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }
        }

        return null;
    }
}
