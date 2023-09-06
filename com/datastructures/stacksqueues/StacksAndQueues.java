package com.com.datastructures.stacksqueues;

import java.util.Stack;

public class StacksAndQueues {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //Queue<Person> queue= new PriorityQueue<Person>(Comparator.com, ));


        stack.push(1);

        stack.push(2);
        stack.push(3);
        System.out.println("peek "+stack.peek());
        System.out.println("pop "+stack.pop());
        System.out.println("peek "+stack.peek());
    }
    static class Person{
        private int age;
        private String name;

        public Person(int age,String name){
            this.age=age;
            this.name=name;
        }

        public String toString(){
            return  this.name+" "+this.age;
        }
    }
}
