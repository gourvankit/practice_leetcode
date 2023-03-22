package com.gourvankit;

public class BST {
     class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    public BST() {
        this.root = null;
    }
    void insert(int data){
        root=insertLoc(data,root);
    }
     Node insertLoc(int data,Node root){
        if(root==null){
            return new Node(data);
        }else if(data<root.data){
            root.left=insertLoc(data,root.left);
        }else if(data>root.data){
            root.right=insertLoc(data,root.right);
        }
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}
