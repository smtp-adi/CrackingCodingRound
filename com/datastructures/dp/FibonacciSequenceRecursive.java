package com.com.datastructures.dp;

/**
 * Recursive method to find fibonacci
 */
public class FibonacciSequenceRecursive {

    public static void main(String[] args) {
        int n=5;
        System.out.println("Nth fibonacci numbemr is "+ fib(n));
    }

    static int fib(int n){
        if(n<=2)
            return 1;
        return fib(n-1)+fib(n-2);
    }

}
