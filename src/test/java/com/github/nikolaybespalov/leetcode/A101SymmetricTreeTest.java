package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class A101SymmetricTreeTest {
    A101SymmetricTree instance = new A101SymmetricTree();

    @Test
    public void test1() {
        assertTrue(instance.isSymmetric(LeetcodeUtils.toTreeNode("1,2,2,3,4,4,3")));
    }

    @Test
    public void test2() {
        assertFalse(instance.isSymmetric(LeetcodeUtils.toTreeNode("1,2,2,null,3,null,3")));
    }
}