package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.Node;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class A589NaryTreePreorderTraversalTest {
    A589NaryTreePreorderTraversal instance = new A589NaryTreePreorderTraversal();

    @Test
    public void test1() {
        Node root = new Node(1);

        Node three = new Node(3);
        three.neighbors.add(new Node(5));
        three.neighbors.add(new Node(6));

        Node two = new Node(2);
        Node four = new Node(4);

        root.neighbors.add(three);
        root.neighbors.add(two);
        root.neighbors.add(four);

        assertEquals(Arrays.asList(1, 3, 5, 6, 2, 4), instance.preorder(root));
    }

}