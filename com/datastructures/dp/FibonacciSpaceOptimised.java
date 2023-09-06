package com.com.datastructures.dp;

/**
 * space optimised fibonacci
 */
public class FibonacciSpaceOptimised {

    public static void main(String[] args) {
        int n=5;
        System.out.println("calculating fibonacci...");
        System.out.println("Nth fibonacci number is "+fib(n));
    }
    static int fib(int n){
        System.out.println("Entered function");

        int nThNumber=0;

        int first=0;
        int second=1;
        int counter=2;
        while(counter <=n){
            System.out.println("counter "+counter);
            nThNumber=second+first;
            first=second;
            second=nThNumber;
            counter++;
        }
        return second;
    }
}
