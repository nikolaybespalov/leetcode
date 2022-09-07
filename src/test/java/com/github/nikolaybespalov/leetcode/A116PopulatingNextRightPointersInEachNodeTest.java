package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.left_right.Node;
import org.junit.Test;

import static com.github.nikolaybespalov.leetcode.LeetcodeUtils.assertSameTree;

public class A116PopulatingNextRightPointersInEachNodeTest {
    A116PopulatingNextRightPointersInEachNode instance = new A116PopulatingNextRightPointersInEachNode();

    @Test
    public void test1() {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);
        tree1.left.left = new Node(4);
        tree1.left.right = new Node(5);
        tree1.right.left = new Node(6);
        tree1.right.right = new Node(7);

        Node expected = new Node(1);
        expected.left = new Node(2);
        expected.right = new Node(3);
        expected.left.left = new Node(4);
        expected.left.right = new Node(5);
        expected.right.left = new Node(6);
        expected.right.right = new Node(7);
        expected.left.next = expected.right;
        expected.left.left.next = expected.left.right;
        expected.left.right.next = expected.right.left;
        expected.right.left.next = expected.right.right;

        assertSameTree(expected, instance.connect(tree1));
    }

    @Test
    public void test2() {
        assertSameTree(null, instance.connect(null));
    }
}