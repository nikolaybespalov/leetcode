package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle-ii/">142. Linked List Cycle II</a>
 */
public class A142LinkedListCycleII {
    public A141LinkedListCycle.ListNode detectCycle(A141LinkedListCycle.ListNode head) {
        A141LinkedListCycle.ListNode slow = head;
        A141LinkedListCycle.ListNode fast = head;

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
