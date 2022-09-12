package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameTree;
import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.toTreeNode;

public class A701InsertIntoABinarySearchTreeTest {
    A701InsertIntoABinarySearchTree instance = new A701InsertIntoABinarySearchTree();

    @Test
    public void test1() {
        assertSameTree(toTreeNode("4,2,7,1,3,5"),
                instance.insertIntoBST(toTreeNode("4,2,7,1,3"), 5));
    }

    @Test
    public void test2() {
        assertSameTree(toTreeNode("40,20,60,10,30,50,70,null,null,25"),
                instance.insertIntoBST(toTreeNode("40,20,60,10,30,50,70"), 25));
    }

    @Test
    public void test3() {
        assertSameTree(toTreeNode("4,2,7,1,3,5"),
                instance.insertIntoBST(toTreeNode("4,2,7,1,3,null,null,null,null,null,null"), 5));
    }
}