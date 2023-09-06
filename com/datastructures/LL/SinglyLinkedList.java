package com.com.datastructures.LL;

class SinglyLinkedList {

    /**
     * basic singly linked list operations
     */


    private int length;
    ListNode head;

    public SinglyLinkedList() {
        length = 0;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtBeginning(1);
        sll.insertAtEnd(2);
        sll.insertAtEnd(3);
        sll.insertAtEnd(5);
        /*sll.insertAtPosition(8, 3);*/
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.insertAtBeginning(2);
        sll2.insertAtEnd(4);
        sll2.insertAtEnd(6);
        //sll2.insertAtPosition(8, 3);
        System.out.println(sll);
        System.out.println(sll2);

        System.out.println("size of list " + sll.getSize());
        System.out.println("size of list " + sll2.getSize());
        System.out.println("printing list "+sll);

        //mergeTwoListsRecursive(sll.head,sll2.head);
        //doIterativeMerge
        //reverseInPairs
        System.out.println("recursive reverse in pairs");
        reverseInPairsRecursive(sll.head);
        System.out.println("pair wise revered "+sll);
        System.out.println("Merged");
        System.out.println(sll);
        System.out.println(sll2);
       /* ListNode temp = sll.head;
        System.out.println("reversing ");
        sll.reverseSLL(temp);
        System.out.println("printing reversed list "+sll);
        System.out.println("size of list " + sll.getSize());
        sll.clearList();
        System.out.println("list cleared "+ sll );
        System.out.println("size of list " + sll.getSize());*/
    }
    public static ListNode reverseInPairsRecursive(ListNode head){

        if (head==null || head.next==null )
            return head;
        else {
            ListNode temp = head.next;
            head.next=temp.next;
            temp.next=head;
            head=temp;
            head.next.next = reverseInPairsRecursive(head.next.next);
            return head;

        }

    }

    public static ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2){
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.data<l2.data){
            l1.next= mergeTwoListsRecursive(l1.next,l2);
            return l1;
        }
        else {
            l2.next= mergeTwoListsRecursive(l1,l2.next);
            return l2;
        }
    }

    public int nthNodeFromTheEnd(ListNode temp, int n){
        /**
         * nth from the end using recursion
         */
       /* int count=1;
        if(temp.next==null)
            return 0;
        if(count == n)
            return count    ;
        else return 1+nthNodeFromTheEnd(temp.getNext(),n);*/
        return 0;
    }

    public void reverseSLL(ListNode temp){

        if(temp==null)
            return;
        ListNode nxt = temp.getNext();
        if(nxt == null){
            temp = head;
        }
        reverseSLL(temp.getNext());
        temp=nxt.getNext();
        temp.setNext(null);
    }

    public int getSize() {
        return length;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.getData()+ "->");
            temp = temp.getNext();
        }
        System.out.println("\n");
    }

    public void insertAtBeginning(int data) {

        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
        length++;

    }

    public void insertAtPosition(int data, int pos) {
        if (pos < 0) {
            pos = 0;
        }
        if (pos > length) {
            pos = length;
        }
        if (head == null) {
            head = new ListNode(data);
            length++;
        } else if (pos == 0) {
            ListNode newNode = new ListNode(data);
            newNode.setNext(head);
            head = newNode;
            length++;
        } else {
            int posCounter = 1;
            ListNode temp = head;
            ListNode newNode = new ListNode(data);
            while (posCounter != pos - 1) {
                temp = temp.getNext();
                posCounter++;
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            length++;
        }
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        length++;
    }

    public void clearList() {
        head = null;
        length = 0;
    }

    class ListNode {
        private int data;
        private ListNode next;//ref to next node

        public ListNode(int data) {
            this.data = data;
        }

        public int getData() {
            return this.data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public ListNode getNext() {
            return this.next;
        }

        public void setNext(ListNode node) {
            this.next = node;
        }
    }

    @Override
    public String toString() {
        String result = "[";
        if (head == null) {
            return result + "]";
        }
        result = result + head.getData();
        ListNode temp = head.getNext();
        while (temp != null) {
            result = result + "," +
                    temp.getData();
            temp = temp.getNext();
        }

        return result + "]";
    }
}
