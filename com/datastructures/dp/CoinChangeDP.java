package com.com.datastructures.dp;

import java.util.Arrays;

/**
 * Find minimum coins required to get equivalent change of a given sum
 */

public class CoinChangeDP {

    public static void main(String[] args){
        Long start=System.currentTimeMillis();
        int n=65;
        int[] arr={7,5,1};
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        //dp[0]=0;
        int ans =minCoins(n,arr,dp);
        System.out.println("min coins required :"+ans);
        Long end=System.currentTimeMillis();
        System.out.println("Time taken DP = "+ Math.subtractExact(end,start));
    }
    private static int minCoins(int n,int[] a,int [] dp){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(n==0)
                return 0;
            if(n-a[i]>=0){
                int subAns;
                if(dp[n-a[i]]!=-1){
                    subAns=dp[n-a[i]];
                }else {
                    subAns = minCoins(n - a[i], a, dp);
                }
                if(subAns+1<ans && subAns<Integer.MAX_VALUE){
                    ans=subAns+1;
                }
            }
        }
        //store the computed answer in memory
       return dp[n]=ans;
    }
}
