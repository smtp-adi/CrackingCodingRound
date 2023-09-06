package com.com.datastructures.dp;


/**
 * Find minimum coins required to get equivalent change of a given sum
 */
public class CoinChangeRecursive {

    private static int minCoins(int sum, int[] a){
        int ans=Integer.MAX_VALUE;
        if(sum==0)
            return 0;
        for(int i=0;i<a.length;i++){
            if(sum-a[i]>=0) {
               int subAns= minCoins(sum - a[i], a);
               if(subAns+1<ans && subAns+1<Integer.MAX_VALUE){
                   ans=subAns+1;
               }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Long start=System.currentTimeMillis();
         int sum=7;
        int[] coins = {1,3,5};
        int ans= minCoins(sum,coins);
        //coins.
        System.out.println("Min coins needed for change is :"+ ans);
        Long end=System.currentTimeMillis();
        System.out.println("Time taken recursive= "+ Math.subtractExact(end,start));
    }

}
