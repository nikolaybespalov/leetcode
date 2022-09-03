package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;
import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameTree;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class A297SerializeAndDeserializeBinaryTreeTest {
    A297SerializeAndDeserializeBinaryTree.Codec instance = new A297SerializeAndDeserializeBinaryTree.Codec();

    @Test
    public void test0() {
        assertNull(instance.deserialize(""));
        assertNull(instance.deserialize("null"));
        assertEquals("null", instance.serialize(null));
    }

    @Test
    public void test1() {
        String data = "1,2,null,null,3,4,null,null,5,null,null";
        assertEquals(data, instance.serialize(instance.deserialize(data)));
    }

    @Test
    public void test2() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(5);

        assertSameTree(tree, instance.deserialize(instance.serialize(tree)));
    }
}