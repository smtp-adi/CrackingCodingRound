package com.com.datastructures.dp;

public class LinkedList {
    Node head;

    static class Node{
        Node next;
        int data;

        public Node(int data){
            data=this.data;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node node= new Node(1);
        Node nextNode= new Node(2);

        LinkedList list= new LinkedList();
        list.head.next=node;

    }


}
