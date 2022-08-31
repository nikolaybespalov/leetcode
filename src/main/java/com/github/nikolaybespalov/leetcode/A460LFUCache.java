package com.github.nikolaybespalov.leetcode;

import java.util.HashMap;

/**
 * @see <a href="https://leetcode.com/problems/lfu-cache/">460. LFU Cache</a>
 */
public class A460LFUCache {
    static class MyLinkedNode<T> {
        MyLinkedNode<T> next;
        MyLinkedNode<T> prev;
        T data;

        public MyLinkedNode(T data) {
            this.data = data;
        }
    }

    static class MyLinkedList<T> {
        MyLinkedNode<T> head;
        MyLinkedNode<T> tail;
        int size = 0;

        void pushFront(MyLinkedNode<T> node) {
            if (head == null) {
                head = node;
                tail = head;
            } else {
                node.next = head;
                head.prev = node;
                head = node;
            }

            size++;
        }

        void remove(MyLinkedNode<T> node) {
            MyLinkedNode<T> next = node.next;
            MyLinkedNode<T> prev = node.prev;

            if (next != null && prev != null) {
                node.prev.next = next;
                node.next.prev = prev;
            } else if (next != null) {
                head = next;
                head.prev = null;
            } else if (prev != null) {
                tail = prev;
                tail.next = null;
            } else {
                head = tail = null;
            }

            node.next = null;
            node.prev = null;

            size--;
        }

        MyLinkedNode<T> popBack() {
            MyLinkedNode<T> node = tail;

            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = tail = null;
            }

            node.next = null;
            node.prev = null;

            size--;

            return node;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    static class KeyValue {
        int key;
        int value;
        int counter;

        public KeyValue(int key, int value) {
            this.key = key;
            this.value = value;
            this.counter = 1;
        }
    }

    private final int capacity;
    private final HashMap<Integer, MyLinkedNode<KeyValue>> nodeMap = new HashMap<>();
    private final HashMap<Integer, MyLinkedList<KeyValue>> countMap = new HashMap<>();
    private int minCounter;

    public A460LFUCache(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("Invalid capacity");
        }

        this.capacity = capacity;
    }

    public int get(int key) {
        MyLinkedNode<KeyValue> node = nodeMap.get(key);

        if (node == null) {
            return -1;
        }

        update(node);

        return node.data.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        MyLinkedNode<KeyValue> node = nodeMap.get(key);

        if (node != null) {
            node.data.value = value;
            update(node);
        } else {
            if (nodeMap.size() == capacity) {
                MyLinkedList<KeyValue> lfList = countMap.get(minCounter);
                MyLinkedNode<KeyValue> removed = lfList.popBack();
                nodeMap.remove(removed.data.key);
            }

            minCounter = 1;

            node = new MyLinkedNode<>(new KeyValue(key, value));
            MyLinkedList<KeyValue> lfList = countMap.getOrDefault(minCounter, new MyLinkedList<>());
            lfList.pushFront(node);
            countMap.put(minCounter, lfList);
            nodeMap.put(node.data.key, node);
        }
    }

    private void update(MyLinkedNode<KeyValue> node) {
        MyLinkedList<KeyValue> lfList = countMap.get(node.data.counter);
        lfList.remove(node);

        if (node.data.counter == minCounter && lfList.isEmpty()) {
            minCounter++;
        }

        node.data.counter++;
        MyLinkedList<KeyValue> newLfList = countMap.getOrDefault(node.data.counter, new MyLinkedList<>());
        newLfList.pushFront(node);
        countMap.put(node.data.counter, newLfList);
    }
}
