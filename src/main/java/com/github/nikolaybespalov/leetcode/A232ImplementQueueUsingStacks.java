package com.github.nikolaybespalov.leetcode;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/implement-queue-using-stacks/">232. Implement Queue using Stacks</a>
 */
public class A232ImplementQueueUsingStacks {
    public static class MyQueue {
        private final Stack<Integer> stack1 = new Stack<>();
        private final Stack<Integer> stack2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            stack2.push(x);

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        public int pop() {
            return stack2.pop();
        }

        public int peek() {
            return stack2.peek();
        }

        public boolean empty() {
            return stack2.isEmpty();
        }
    }
}
