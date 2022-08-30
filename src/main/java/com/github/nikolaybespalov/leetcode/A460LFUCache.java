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
    private MyLinkedNode<KeyValue> tail;

    public A460LFUCache(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("Invalid capacity");
        }

        this.capacity = capacity;
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }

        MyLinkedNode<KeyValue> node = keyToNode.get(key);

        if (node == null) {
            return -1;
        }

        MyLinkedNode<KeyValue> prev = removeNode(node);

        node.data.cnt++;

        putNode(node, prev);

        return node.data.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        if (keyToNode.containsKey(key)) {
            MyLinkedNode<KeyValue> node = keyToNode.get(key);

            node.data.value = value;

            MyLinkedNode<KeyValue> prev = removeNode(node);

            node.data.cnt++;

            putNode(node, prev);

            return;
        }

        MyLinkedNode<KeyValue> prev = null;

        if (keyToNode.size() == capacity) {
            keyToNode.remove(tail.data.key);

            prev = removeNode(tail);
        }

        MyLinkedNode<KeyValue> head;

        if (keyToNode.size() == 0) {
            head = new MyLinkedNode<>(new KeyValue(key, value));
            tail = head;
        } else {
            MyLinkedNode<KeyValue> node = new MyLinkedNode<>(new KeyValue(key, value));
            head = cntToHead.get(1);

            if (head != null) {
                if (head.prev != null) {
                    head.prev.next = node;
                    node.prev = head.prev;
                }
                node.next = head;
                head.prev = node;
            } else {
                if (prev != null) {
                    node.prev = prev;
                    prev.next = node;
                } else {
                    int asd = 0;
                    int asdf = asd;
                }
            }

            head = node;

            if (node.next == null) {
                tail = node;
            }
        }

        cntToHead.put(1, head);
        keyToNode.put(key, head);
    }

    private void putNode(MyLinkedNode<KeyValue> node, MyLinkedNode<KeyValue> prev2) {
//        if (node.prev == null) {
//            return;
//        }

        MyLinkedNode<KeyValue> head = cntToHead.get(node.data.cnt);

        if (head != null) {
            if (head.prev != null) {
                head.prev.next = node;
                node.prev = head.prev;
            }

            head.prev = node;
            node.next = head;
        } else {
            // Тут нужно иметь такой, что минимальный близкий справа
            MyLinkedNode<KeyValue> next = cntToHead.get(node.data.cnt - 1);

            if (next != null) {
                node.next = next;
                next.prev = node;
            } else {
                node.next = null;
            }

            // Тут нужно иметь такой что максимально близкий слева
            MyLinkedNode<KeyValue> prev = cntToHead.get(node.data.cnt + 1);

            if (prev != null) {
                node.prev = prev;
                prev.next = node;
            } else {
                node.prev = null;
            }
        }

        head = node;

        cntToHead.put(head.data.cnt, head);
    }

    private MyLinkedNode<KeyValue> removeNode(MyLinkedNode<KeyValue> node) {
        if (node.prev == null && node.next == null ||
                node.next == null && node.data.cnt < node.prev.data.cnt ||
                node.prev == null && node.data.cnt > node.next.data.cnt ||
                node.prev != null && node.next != null && node.data.cnt < node.prev.data.cnt && node.data.cnt > node.next.data.cnt) {
            cntToHead.remove(node.data.cnt);
        }

        if (node.prev == null && node.next != null ||
                node.prev != null && node.data.cnt < node.prev.data.cnt && node.next != null) {
            cntToHead.put(node.next.data.cnt, node.next);
        }

        if (node.prev == null) {
            return null;
        } else if (node.next == null) {
            tail = node.prev;
            tail.next = null;
        } else {
            MyLinkedNode<KeyValue> next = node.next;
            MyLinkedNode<KeyValue> prev = node.prev;
            node.prev.next = next;
            node.next.prev = prev;
        }

        MyLinkedNode<KeyValue> prev = node.prev;

        //node.prev = null;
        //node.next = null;

        return prev;
    }
}
