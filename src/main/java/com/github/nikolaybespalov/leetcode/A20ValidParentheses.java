package com.github.nikolaybespalov.leetcode;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */
public class A20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                if (c == ')' && stack.peek() != '(')
                    return false;

                if (c == ']' && stack.peek() != '[')
                    return false;

                if (c == '}' && stack.peek() != '{')
                    return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
