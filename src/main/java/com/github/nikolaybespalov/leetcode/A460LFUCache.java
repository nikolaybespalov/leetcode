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

    static class KeyValue {
        int key;
        int value;
        int cnt;

        public KeyValue(int key, int value) {
            this.key = key;
            this.value = value;
            this.cnt = 1;
        }
    }

    private final int capacity;
    private final HashMap<Integer, MyLinkedNode<KeyValue>> keyToNode = new HashMap<>();
    private final HashMap<Integer, MyLinkedNode<KeyValue>> cntToHead = new HashMap<>();
//    private MyLinkedNode<KeyValue> head;
    private MyLinkedNode<KeyValue> tail;

    public A460LFUCache(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("Invalid capacity");
        }

        this.capacity = capacity;
        this.cntToHead.put(1, null);
    }

    public int get(int key) {
        MyLinkedNode<KeyValue> node = keyToNode.get(key);

        if (node == null) {
            return -1;
        }

        node.data.cnt++;

        moveToHead(node);

        cntToHead.put(node.data.cnt, node);

        return node.data.value;
    }

    public void put(int key, int value) {
        if (keyToNode.containsKey(key)) {
            MyLinkedNode<KeyValue> node = keyToNode.get(key);

            node.data.value = value;
            node.data.cnt++;

            moveToHead(node);

            return;
        }

        if (keyToNode.size() == capacity) {
            keyToNode.remove(tail.data.key);

            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            }
        }

        MyLinkedNode<KeyValue> head;

        if (keyToNode.size() == 0) {
            head = new MyLinkedNode<>(new KeyValue(key, value));
            tail = head;
        } else {
            MyLinkedNode<KeyValue> node = new MyLinkedNode<>(new KeyValue(key, value));
            head = cntToHead.get(1);

            node.next = head;
            head.prev = node;
            head = node;
        }

        cntToHead.put(head.data.cnt, head);
        keyToNode.put(key, head);
    }

    private void moveToHead(MyLinkedNode<KeyValue> node, MyLinkedNode<KeyValue> head) {
        if (node.prev == null) {
            //return;
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

        cntToHead.put(head.data.cnt, head);
    }

    private void moveToHead(MyLinkedNode<KeyValue> node) {
        moveToHead(node, cntToHead.get(node.data.cnt));
    }
}
