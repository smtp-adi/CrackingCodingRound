package com.com.datastructures.LL;

public class LinkedListReverseRecursion {
    static Node head=null;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListReverseRecursion ll= new LinkedListReverseRecursion();
        push(2);
        push(3);
        push(4);
        push(1);
        print();

       // reverse(ll);
    }
    static void reverse(LinkedListReverseRecursion ll){
        while(ll.head.next!=null){

        }
    }
    static void push(int data){
       Node temp= head;
       Node n= new Node(data);
       head=n;


    }
    static void print(){
        System.out.println("printing list :");
        while(head.next!=null){
            System.out.println(head.next.data);
            head=head.next;
        }
    }
}
