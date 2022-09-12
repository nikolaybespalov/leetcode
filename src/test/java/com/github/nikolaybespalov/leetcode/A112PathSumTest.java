package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toTreeNode;
import static org.junit.Assert.*;

public class A112PathSumTest {
    A112PathSum instance = new A112PathSum();

    @Test
    public void test1() {
        assertTrue(instance.hasPathSum(toTreeNode("5,4,8,11,null,13,4,7,2,null,null,null,1"), 22));
    }

    @Test
    public void test2() {
        assertFalse(instance.hasPathSum(toTreeNode("1,2,3"), 5));
    }

    @Test
    public void test3() {
        assertFalse(instance.hasPathSum(toTreeNode(""), 0));
    }

    @Test
    public void test4() {
        assertFalse(instance.hasPathSum(toTreeNode("1,2"), 1));
    }
}