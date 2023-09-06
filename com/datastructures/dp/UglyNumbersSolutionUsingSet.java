package com.com.datastructures.dp;

import java.util.TreeSet;

public class UglyNumbersSolutionUsingSet {

    public static void main(String... args){
        int n=8;
        int ans=nthUglyNumberIs(n);
        System.out.println("Ans :"+ans);
    }
    private static int nthUglyNumberIs(int n){
        int uglyNumberCount=1;
        int firstUglyNumber=1;
        TreeSet<Integer> set= new TreeSet<>();
        set.add(firstUglyNumber);
        while (uglyNumberCount<n){
            int temp=set.pollFirst();
            set.add(temp*2);
            set.add(temp*3);
            set.add(temp*5);
            uglyNumberCount++;
        }

        return set.pollFirst();
    }
}
