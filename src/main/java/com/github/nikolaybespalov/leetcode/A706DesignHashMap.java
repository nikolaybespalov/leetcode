package com.github.nikolaybespalov.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/design-hashmap/">706. Design HashMap</a>
 */
public class A706DesignHashMap {
    public static class MyHashMap {
        private static final int INITIAL_CAPACITY = 10001;
        private static final float LOAD_FACTOR = 0.75f;

        static class MyListNode {
            int key;
            int value;
            MyListNode next;

            MyListNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private MyListNode[] table = new MyListNode[INITIAL_CAPACITY];
        private int size = 0;

        public MyHashMap() {
        }

        public void put(int key, int value) {
            if (size == LOAD_FACTOR * table.length) {
                copyTable(new MyListNode[table.length * 2]);
            }

            int i = indexFor(key);

            boolean updated = false;

            for (MyListNode node = table[i]; node != null; node = node.next) {
                if (node.key == key) {
                    node.value = value;
                    updated = true;
                    break;
                }
            }

            if (!updated) {
                table[i] = addNode(table[i], key, value);

                size++;
            }
        }

        public int get(int key) {
            int i = indexFor(key);

            for (MyListNode node = table[i]; node != null; node = node.next) {
                if (node.key == key) {
                    return node.value;
                }
            }

            return -1;
        }

        public void remove(int key) {
            if (size == 0) {
                return;
            }

            if (size == LOAD_FACTOR * table.length) {
                copyTable(new MyListNode[table.length / 2]);
            }

            int i = indexFor(key);

            MyListNode newHead = removeNode(table[i], key);

            if (newHead != table[i]) {
                table[i] = newHead;

                size--;
            }
        }

        private MyListNode addNode(MyListNode head, int key, int value) {
            MyListNode node = new MyListNode(key, value);

            node.next = head;

            return node;
        }

        private MyListNode removeNode(MyListNode head, int key) {
            MyListNode prev = null;

            for (MyListNode node = head; node != null; prev = node, node = node.next) {
                if (node.key == key) {
                    if (prev != null) {
                        prev.next = node.next;
                    } else {
                        prev = node.next;
                        head = prev;
                    }
                    break;
                }
            }

            return head;
        }

        private void copyTable(MyListNode[] newTable) {
            for (MyListNode head : table) {
                for (MyListNode node = head; node != null; node = node.next) {
                    int j = indexFor(node.key, newTable);
                    newTable[j] = addNode(newTable[j], node.key, node.value);
                }
            }

            table = newTable;
        }

        private int indexFor(int key) {
            return indexFor(key, table);
        }

        private static int indexFor(int key, MyListNode[] table) {
            return key % table.length;
        }
    }
}
