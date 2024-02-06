package org.example.datastructure;

import java.util.ArrayList;


public class binary_tree_dfs {
    // define a TreeNode class
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    // define a list to store the result
    // use static to avoid the list is initialized every time
    static ArrayList<Integer> list = new ArrayList<>();

    // preOrder traversal
    //  means
    void preOrder(TreeNode root) {
        if (root == null)
            return;
        list.add(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // postOrder traversal
    void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.data);
    }

    // inOrder traversal
    void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {

    }
}
