package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

import java.util.Iterator;

/**
 * @see <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree/">297. Serialize and Deserialize Binary Tree</a>
 */
public class A297SerializeAndDeserializeBinaryTree {
    public static class Codec {
        static class DataIterator implements Iterator<Integer> {
            private final String s;
            private int i;
            private Integer next;

            DataIterator(String s) {
                this.s = s;
            }

            public boolean hasNext() {
                if (i >= s.length()) {
                    return false;
                }

                int commaPosition = s.indexOf(',', i);

                String asd;

                if (commaPosition == -1) {
                    asd = s.substring(i);
                } else {
                    asd = s.substring(i, commaPosition);
                }

                i += asd.length() + 1;

                if (asd.equals("null")) {
                    next = null;
                } else {
                    next = Integer.parseInt(asd);
                }

                return true;
            }

            public Integer next() {
                return next;
            }
        }

        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();

            serialize(root, sb);

            sb.setLength(Math.max(sb.length() - 1, 0));

            return sb.toString();
        }

        public TreeNode deserialize(String data) {
            return deserialize(null, new DataIterator(data));
        }

        private TreeNode deserialize(TreeNode node, DataIterator it) {
            if (it.hasNext()) {
                Integer val = it.next();

                if (val != null) {
                    node = new TreeNode(val);

                    node.left = deserialize(node.left, it);
                    node.right = deserialize(node.right, it);
                }
            }

            return node;
        }

        private void serialize(TreeNode node, StringBuilder sb) {
            if (node != null) {
                sb.append(node.val);
                sb.append(",");

                serialize(node.left, sb);
                serialize(node.right, sb);
            } else {
                sb.append((String) null);
                sb.append(",");
            }
        }
    }
}
