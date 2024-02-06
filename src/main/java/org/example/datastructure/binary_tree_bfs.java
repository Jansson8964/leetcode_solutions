package org.example.datastructure;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binary_tree_bfs {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    // level-order traversal
    public List<Integer> levelOrder(TreeNode root) {
        // initialize the queue , add rootnode
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // add linkedlist to store the result
        List<Integer> result = new LinkedList<>();
        // if queue is not empty
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            result.add(node.data);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.left);
            }

        }
        return result;
    }

}
