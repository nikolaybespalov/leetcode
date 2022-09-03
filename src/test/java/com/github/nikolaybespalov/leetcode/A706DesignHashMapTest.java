package com.github.nikolaybespalov.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A706DesignHashMapTest {
    @Test
    public void test0() {
        A706DesignHashMap.MyHashMap instance = new A706DesignHashMap.MyHashMap();

        instance.put(1, 123);
        assertEquals(123, instance.get(1));
        instance.remove(1);
        assertEquals(-1, instance.get(1));
    }

    @Test
    public void test1() {
        A706DesignHashMap.MyHashMap instance = new A706DesignHashMap.MyHashMap();

        instance.put(1, 1);
        instance.put(2, 2);
        assertEquals(1, instance.get(1));
        assertEquals(-1, instance.get(3));
        instance.put(2, 1);
        assertEquals(1, instance.get(2));
        instance.remove(2);
        assertEquals(-1, instance.get(2));
    }

    @Test
    public void test2() {
        A706DesignHashMap.MyHashMap instance = new A706DesignHashMap.MyHashMap();

        final int size = 10000;

        for (int i = 0; i < size; i++) {
            instance.put(i, i);
        }

        for (int i = 0; i < size; i++) {
            assertEquals(i, instance.get(i));
        }

        for (int i = 0; i < size; i++) {
            instance.remove(i);
        }

        for (int i = 0; i < size; i++) {
            assertEquals(-1, instance.get(i));
        }

        for (int i = 0; i < size; i++) {
            instance.put(i, i);
        }

        for (int i = 0; i < size; i++) {
            instance.put(i, size - i);
        }

        for (int i = 0; i < size; i++) {
            assertEquals(size - i, instance.get(i));
        }

        for (int i = 0; i < size; i++) {
            instance.remove(i);
        }

        for (int i = 0; i < size; i++) {
            assertEquals(-1, instance.get(i));
        }
    }

    @Test
    public void test3() {
        A706DesignHashMap.MyHashMap instance = new A706DesignHashMap.MyHashMap();

        final int size = 1000;

        for (int i = 0; i < size; i++) {
            instance.put(1, i);
            instance.remove(1);
            instance.put(1, i);
        }

        assertEquals(size - 1, instance.get(1));
        instance.remove(1);
        assertEquals(-1, instance.get(1));
    }

    @Test
    public void test4() {
        A706DesignHashMap.MyHashMap instance = new A706DesignHashMap.MyHashMap();

        final int size = 1000;

        for (int i = 0; i < size; i++) {
            instance.put(i, i);
        }

        for (int i = 0; i < size; i++) {
            assertEquals(i, instance.get(i));
        }

        for (int i = 500; i < 600; i++) {
            instance.remove(i);
        }

        for (int i = 0; i < 500; i++) {
            assertEquals(i, instance.get(i));
        }

        for (int i = 600; i < size; i++) {
            assertEquals(i, instance.get(i));
        }
    }
}