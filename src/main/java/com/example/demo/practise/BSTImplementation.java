package com.example.demo.practise;

public class BSTImplementation {
    Node root = null;

    public void insertNode(int data) {

        root = insertData(root, data);
    }

    public Node insertData(Node root, int data) {
        if (root == null) {
            root = new Node();
            root.data = data;
            root.right = null;
            root.left = null;
            return root;
        }
        if (root.data > data) {
            root.left = insertData(root.left, data);

        } else if (root.data < data) {
            root.right = insertData(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        BSTImplementation implementation = new BSTImplementation();
        implementation.insertNode(15);
        implementation.insertNode(10);
        implementation.insertNode(20);
        implementation.insertNode(9);
        implementation.insertNode(12);
        implementation.insertNode(22);
        implementation.insertNode(18);

    }
}
