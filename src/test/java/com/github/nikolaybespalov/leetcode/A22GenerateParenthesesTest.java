package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class A22GenerateParenthesesTest {
    A22GenerateParentheses instance = new A22GenerateParentheses();

    @Test
    public void test1() {
        assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"),
                instance.generateParenthesis(3));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList("(())", "()()"),
                instance.generateParenthesis(2));
    }

    @Test
    public void test3() {
        assertEquals(Collections.singletonList("()"),
                instance.generateParenthesis(1));
    }

}