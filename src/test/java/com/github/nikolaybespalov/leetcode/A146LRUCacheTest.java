package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A146LRUCacheTest {

    @Test
    public void test1() {
        A146LRUCache instance = new A146LRUCache(123);

        assertEquals(-1, instance.get(0));
        instance.put(0, 0);
        assertEquals(0, instance.get(0));
    }

    @Test
    public void test2() {
        A146LRUCache instance = new A146LRUCache(3);

        instance.put(0, 0);
        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(0, instance.get(0));
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
    }

    @Test
    public void test3() {
        A146LRUCache instance = new A146LRUCache(3);

        instance.put(0, 0);
        instance.put(1, 1);
        instance.put(2, 2);
        instance.put(3, 3);
        assertEquals(-1, instance.get(0));
        assertEquals(1, instance.get(1));
        assertEquals(2, instance.get(2));
        assertEquals(3, instance.get(3));
    }

    @Test
    public void test4() {
        A146LRUCache instance = new A146LRUCache(2);

        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(1, instance.get(1));
        instance.put(3, 3);
        assertEquals(-1, instance.get(2));
        instance.put(4, 4);
        assertEquals(-1, instance.get(1));
        assertEquals(3, instance.get(3));
        assertEquals(4, instance.get(4));
    }

    @Test
    public void test5() {
        A146LRUCache instance = new A146LRUCache(1);

        instance.put(2, 1);
        assertEquals(1, instance.get(2));
    }

    @Test
    public void test6() {
        A146LRUCache instance = new A146LRUCache(2);

        assertEquals(-1, instance.get(2));
        instance.put(2, 6);
        assertEquals(-1, instance.get(1));
        instance.put(1, 5);
        instance.put(1, 2);
        assertEquals(2, instance.get(1));
        assertEquals(6, instance.get(2));
    }

    @Test
    public void test7() {
        A146LRUCache instance = new A146LRUCache(2);

        instance.put(2, 1);
        instance.put(3, 2);
        assertEquals(2, instance.get(3));
        assertEquals(1, instance.get(2));
        instance.put(4, 3);
        assertEquals(1, instance.get(2));
        assertEquals(-1, instance.get(3));
        assertEquals(3, instance.get(4));
    }

    @Test
    public void test8() {
        A146LRUCache instance = new A146LRUCache(1);

        assertEquals(-1, instance.get(6));
        assertEquals(-1, instance.get(8));
        instance.put(12, 1);
        assertEquals(-1, instance.get(2));
        instance.put(15, 11);
        instance.put(5, 2);
        instance.put(1, 15);
        instance.put(4, 2);
        assertEquals(-1, instance.get(5));
        instance.put(15, 15);
    }
}