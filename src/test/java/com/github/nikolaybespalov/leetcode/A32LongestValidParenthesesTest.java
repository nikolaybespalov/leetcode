package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A32LongestValidParenthesesTest {
    A32LongestValidParentheses instance = new A32LongestValidParentheses();

    @Test
    public void test1() {
        assertEquals(2, instance.longestValidParentheses("(()"));
    }

    @Test
    public void test2() {
        assertEquals(4, instance.longestValidParentheses(")()())"));
    }

    @Test
    public void test3() {
        assertEquals(2, instance.longestValidParentheses("()"));
    }

    @Test
    public void test4() {
        assertEquals(0, instance.longestValidParentheses(")("));
    }

    @Test
    public void test5() {
        assertEquals(0, instance.longestValidParentheses(")"));
    }

    @Test
    public void test6() {
        assertEquals(12, instance.longestValidParentheses("(((((()))))))"));
    }

    @Test
    public void test7() {
        assertEquals(2, instance.longestValidParentheses("()("));
    }

    @Test
    public void test8() {
        assertEquals(2, instance.longestValidParentheses("())"));
    }

    @Test
    public void test9() {
        assertEquals(2, instance.longestValidParentheses(")()"));
    }

    @Test
    public void test10() {
        assertEquals(2, instance.longestValidParentheses(")()("));
    }

    @Test
    public void test11() {
        assertEquals(4, instance.longestValidParentheses("()()"));
    }

}