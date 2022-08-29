package com.github.nikolaybespalov.leetcode;

import java.util.HashMap;

/**
 * @see <a href="https://leetcode.com/problems/lru-cache/">146. LRU Cache</a>
 */
public class A146LRUCache {
    static class MyLinkedNode<T> {
        MyLinkedNode<T> next;
        MyLinkedNode<T> prev;
        T value;

        public MyLinkedNode(T value) {
            this.value = value;
        }
    }

    static class KeyValue {
        int key;
        int value;

        public KeyValue(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final HashMap<Integer, MyLinkedNode<KeyValue>> keyToNode = new HashMap<>();
    private MyLinkedNode<KeyValue> head;
    private MyLinkedNode<KeyValue> tail;

    public A146LRUCache(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("Invalid capacity");
        }

        this.capacity = capacity;
    }

    public int get(int key) {
        MyLinkedNode<KeyValue> node = keyToNode.get(key);

        if (node == null) {
            return -1;
        }

        moveToHead(node);

        return head.value.value;
    }

    public void put(int key, int value) {
        if (keyToNode.containsKey(key)) {
            MyLinkedNode<KeyValue> node = keyToNode.get(key);

            node.value.value = value;

            moveToHead(node);

            return;
        }

        if (keyToNode.size() == capacity) {
            keyToNode.remove(tail.value.key);

            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            }
        }

        if (keyToNode.size() == 0) {
            head = new MyLinkedNode<>(new KeyValue(key, value));
            tail = head;
        } else {
            MyLinkedNode<KeyValue> node = new MyLinkedNode<>(new KeyValue(key, value));

            node.next = head;
            head.prev = node;
            head = node;
        }

        keyToNode.put(key, head);
    }

    private void moveToHead(MyLinkedNode<KeyValue> node) {
        if (node.prev == null) {
            return;
        } else if (node.next == null) {
            tail = node.prev;
            tail.next = null;
        } else {
            MyLinkedNode<KeyValue> next = node.next;
            MyLinkedNode<KeyValue> prev = node.prev;
            node.prev.next = next;
            node.next.prev = prev;
        }

        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
    }
}
