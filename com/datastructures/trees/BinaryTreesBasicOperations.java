package com.com.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesBasicOperations {
    static BinaryTreeNode root;
    public static void main(String[] args) {
        root = new BinaryTreeNode(5);
        root.setLeft(new BinaryTreeNode(9));
        root.setRight(new BinaryTreeNode(11));
        System.out.println("PreOrder Traversal");
        preOrderTraversal(root);
        System.out.println("InOrder Traversal");
        inorderTraversal(root);
        System.out.println("postOrder Traversal");
        postOrderTraversal(root);
        insert(root,16);
        insert(root,17);
        insert(root,18);
        insert(root,19);
        System.out.println("PreOrder Traversal");
        preOrderTraversal(root);


    }
    private static void preOrderTraversal(BinaryTreeNode root){
        if(root!=null) {
            System.out.println(root.getData());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }
    private static void inorderTraversal(BinaryTreeNode root){
        if(root!=null){
            inorderTraversal(root.getLeft());
            System.out.println(root.getData());
            inorderTraversal(root.getRight());
        }
    }
    private static void postOrderTraversal(BinaryTreeNode root){
        if(root!=null){
            inorderTraversal(root.getLeft());
            inorderTraversal(root.getRight());
            System.out.println(root.getData());
        }
    }

    private static void insert(BinaryTreeNode temp,int data){
        /** need to have temp reference to root
         * because if new node to be inserted is
         * the first node it has to be root node
         * and we need a reference to point to root.
         */

        if(temp==null){
            root = new BinaryTreeNode(data);
            return;
        }
        Queue<BinaryTreeNode> queue= new LinkedList<>();
        queue.add(temp);
        while(!queue.isEmpty()){
            temp=queue.poll();
            //queue.remove();
            if(temp.getLeft()==null){
                temp.setLeft(new BinaryTreeNode(data));
                break;
            }
            else{
                queue.add(temp.getLeft());
            }
            if(temp.getRight()==null){
                temp.setRight(new BinaryTreeNode(data));
                break;
            }
            else{
                queue.add(temp.getRight());
            }

        }


    }
   /* private static boolean delete(){

    }*/
}
