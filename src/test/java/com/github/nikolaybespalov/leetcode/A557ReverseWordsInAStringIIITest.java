package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


public class A557ReverseWordsInAStringIIITest {
    A557ReverseWordsInAStringIII instance = new A557ReverseWordsInAStringIII();

    @Test
    public void test1() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", instance.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void test2() {
        assertEquals("doG gniD", instance.reverseWords("God Ding"));
    }
}