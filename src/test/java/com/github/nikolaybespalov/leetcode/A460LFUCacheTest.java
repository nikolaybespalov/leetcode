package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A460LFUCacheTest {
    @Test
    public void test1() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(1, instance.get(1));
        instance.put(3, 3);
        assertEquals(-1, instance.get(2));
        assertEquals(3, instance.get(3));
        instance.put(4, 4);
        assertEquals(-1, instance.get(1));
        assertEquals(3, instance.get(3));
        assertEquals(4, instance.get(4));
    }

    @Test
    public void test2() {
        A460LFUCache instance = new A460LFUCache(3);
        instance.put(1, 1);
        instance.put(2, 2);
        instance.put(3, 3);
        assertEquals(-1, instance.get(0));
        assertEquals(3, instance.get(3));
        assertEquals(2, instance.get(2));
        assertEquals(1, instance.get(1));
    }

    @Test
    public void test3() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        instance.put(3, 3);
        assertEquals(-1, instance.get(1));
        assertEquals(2, instance.get(2));
        assertEquals(3, instance.get(3));
    }

    @Test
    public void test4() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(3, 1);
        instance.put(2, 1);
        instance.put(2, 2);
        instance.put(4, 4);
        assertEquals(2, instance.get(2));
    }

    @Test
    public void test5() {
        A460LFUCache instance = new A460LFUCache(0);
        instance.put(0, 0);
        assertEquals(-1, instance.get(0));
    }

    @Test
    public void test6() {
        A460LFUCache instance = new A460LFUCache(2);
        instance.put(2, 1);
        instance.put(2, 2);
        assertEquals(2, instance.get(2));
        instance.put(1, 1);
        instance.put(4, 1);
        assertEquals(2, instance.get(2));
    }

    @Test
    public void test7() {
        A460LFUCache instance = new A460LFUCache(3);
        instance.put(2, 2);
        instance.put(1, 1);
        assertEquals(2, instance.get(2));
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        instance.put(3, 3);
        instance.put(4, 4);
        assertEquals(-1, instance.get(3));
        assertEquals(2, instance.get(2));
        assertEquals(1, instance.get(1));
        assertEquals(4, instance.get(4));
    }

    @Test
    public void test8() {
        A460LFUCache instance = new A460LFUCache(2);
        assertEquals(-1, instance.get(2));
        instance.put(2, 6);
        assertEquals(-1, instance.get(1));
        instance.put(1, 5);
        instance.put(1, 2);
        assertEquals(2, instance.get(1));
        assertEquals(6, instance.get(2));
    }

}