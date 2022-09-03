package com.github.nikolaybespalov.leetcode;

import com_github_leetcode.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @see <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree/">297. Serialize and Deserialize Binary Tree</a>
 */
public class A297SerializeAndDeserializeBinaryTree {
    public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();

            serialize(root, sb);

            sb.setLength(Math.max(sb.length() - 1, 0));

            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isEmpty()) {
                return null;
            }

            String[] parts = data.split(",");

            return deserialize(parts);
        }

        private TreeNode deserialize(String[] parts) {
            TreeNode root;

            if (parts[0].equals("null")) {
                root = null;
            } else {
                root = new TreeNode(Integer.parseInt(parts[0]));
            }

            deserialize(root, parts, new AtomicInteger(1));

            return root;
        }

        private void deserialize(TreeNode root, String[] parts, AtomicInteger i) {
            if (root != null) {
                if (i.get() < parts.length) {
                    if (!parts[i.get()].equals("null")) {
                        root.left = new TreeNode(Integer.parseInt(parts[i.get()]));
                    }
                    i.incrementAndGet();
                    deserialize(root.left, parts, i);
                }
                if (i.get() < parts.length) {
                    if (!parts[i.get()].equals("null")) {
                        root.right = new TreeNode(Integer.parseInt(parts[i.get()]));
                    }
                    i.incrementAndGet();
                    deserialize(root.right, parts, i);
                }
            }
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
