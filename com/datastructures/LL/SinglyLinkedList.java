package com.com.datastructures.LL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SinglyLinkedList<T>
{
    /**
     * head pointing to first node of LL.
     */
    private SLLNode<T> head;

    /**
     * Method to insert node at the end of the list.
     *
     * @param newNode new node.
     */
    public void insertAtEnd(SLLNode<T> newNode) {
        if (head == null) {
            head = newNode;
        }
        else {
            SLLNode<T> curr, temp;
            for (curr = head; curr.getNext() != null; curr = curr.getNext()) ;
            curr.setNext(newNode);

            //While loop works as well.
            /*SLLNode<T> curr = head;
            while (curr.getNext() != null)
            {
                System.out.println("Curr is " +curr.getData());
                curr =curr.getNext();
            }
            curr.setNext(newNode);*/
        }

    }

    /**
     * print the data in each of the nodes starting from beginning.
     */
    public void printSLL() {
        if (head == null) {
            System.out.println("No nodes i.e. empty list");
        }
        if (head.getNext() == null) {
            System.out.println(head.getData() + "->");
        } else {
            SLLNode<T> curr = head;
            while (curr.getNext() != null) {
                System.out.print(curr.getData() + "->");
                curr = curr.getNext();
            }
            System.out.println(curr.getData() + "->");
        }

    }

    /**
     * main funtion
     * @param args arguments if any.
     */
    public static void main(String[] args) {
        com.com.datastructures.LL.Test<Integer> sll = new com.com.datastructures.LL.Test<>();
        List<Integer> list = new LinkedList();
        list.add(2);
        sll.insertAtEnd(new SLLNode<>(3));
        sll.insertAtEnd(new SLLNode<>(4));
        sll.insertAtEnd(new SLLNode<>(5));
        sll.printSLL();
    }
}