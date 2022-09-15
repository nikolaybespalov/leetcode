package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A169MajorityElementTest {
    A169MajorityElement instance = new A169MajorityElement();

    @Test
    public void test1() {
        assertEquals(3, instance.majorityElement(new int[]{
                3, 2, 3
        }));
    }

    @Test
    public void test2() {
        assertEquals(2, instance.majorityElement(new int[]{
                2, 2, 1, 1, 1, 2, 2
        }));
    }

    @Test
    public void test3() {
        assertEquals(2, instance.majorityElement(new int[]{
                1, 2, 1, 2, 1, 2, 2
        }));
    }

    @Test
    public void test4() {
        assertEquals(2, instance.majorityElement(new int[]{
                1, 2, 1, 2, 1, 2, 3, 4, 2, 5
        }));
    }
}