package com.com.datastructures.LL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class with basic linked list operations.
 *
 * @param <T> type param.
 */
class SinglyLinkedList<T>
{
    /**
     * head pointing to first node of LL.
     */
    private SLLNode<T> head;

    /**
     * number of nodes in list
     */
    private int count;

    /**
     * Constructor.
     */
    public SinglyLinkedList ()
    {
        this.count = 0;
    }

    /**
     * Method to insert node at the end of the list.
     *
     * @param newNode new node.
     */
    public void insertAtEnd(SLLNode<T> newNode) {
        if (head == null) {
            head = newNode;
            count++;
        }
        else {
            SLLNode<T> curr, temp;
            for (curr = head; curr.getNext() != null; curr = curr.getNext()) ;
            curr.setNext(newNode);
            this.count++;

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
     *
     * Commenting out the below code as toString method takes care of printing.
     */
    /*public void printSLL() {
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

    }*/
    /**
     * method to insert node at begining of list.
     */
    public void insertAtBeginning(SLLNode<T> newNode)
    {
        SLLNode<T> curr = head;
        if(head == null) {
            head.setNext(newNode);
            count++;
        }
        else {
            head = newNode;
            newNode.setNext(curr);
            count++;
        }
    }

    /**
     * method to return total nodes in singly LL.
     * @return total nodes in singly LL.
     */
    public int getTotalNodes ()
    {
        return this.count;
    }

    /**
     * Method to clear the list.
     */
    public void clearList ()
    {
        this.head = null;
        this.count = 0;
    }

    /**
     * Insert at kth postition from beginning.
     *
     * @param pos position to insert at.
     * @param newNode new node to be inserted.
     */
    public void insertAtKthPositionFromBeginning(int pos, SLLNode newNode)
    {
        //assuming first element is at pos 0.
        if (pos > count || pos < 1)
        {
            System.out.println("Incorrect position");
        }
        else {
            if(pos == 1) {
                newNode.setNext(head);
                head = newNode;
                this.count++;
            }
            else {
                int currPosition = 1;
                SLLNode curr;
                curr = head;
                while (currPosition < pos -1) {
                    curr = curr.getNext();
                    currPosition++;
                }
                newNode.setNext(curr.getNext());
                curr.setNext(newNode);
                this.count++;
            }
        }
    }

    /**
     * Insert at Kth position from end.
     *
     * @param pos position from end.
     * @param newNode new node to be inserted.
     */
    public void insertAtKthPositionFromEnd(int pos,SLLNode newNode)
    {
        //kth position from end means (n-k+1)th pos from beginning.
        //where n is total nodes.
        int counter = 1;
        int posFromEnd = this.count - pos;
        SLLNode curr = this.head;
        while (counter!= posFromEnd+1) {
            curr = curr.getNext();
            counter++;
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
    }

    /**
     * main function.
     * @param args arguments if any.
     */
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insertAtEnd(new SLLNode<>(3));
        sll.insertAtEnd(new SLLNode<>(4));
        sll.insertAtEnd(new SLLNode<>(5));
        System.out.println(sll);
        sll.insertAtBeginning(new SLLNode<>(2));
        System.out.println(sll);
        System.out.println("Total Nodes: "+ sll.getTotalNodes());
        //sll.clearList();
        sll.insertAtKthPositionFromBeginning(2,new SLLNode<>(99));
        System.out.println(sll);
        System.out.println(sll.count);
        sll.insertAtKthPositionFromEnd(1,new SLLNode<>(98));
        System.out.println(sll);;
    }

    @Override
    public String toString ()
    {
        String result ="[";
        if (head == null)
            return result + "]";
        result= result + head.getData();
        SLLNode temp = head.getNext();
        while (temp != null) {
            result = result +", "+ temp.getData();
            temp = temp.getNext();
        }
        return result + "]";
    }
}

