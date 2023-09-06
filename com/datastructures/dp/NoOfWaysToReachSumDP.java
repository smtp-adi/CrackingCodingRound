package com.com.datastructures.dp;

import java.util.Arrays;

/**
 * this soulution is Top Down Approach DP solution or Memoization
 */

public class NoOfWaysToReachSumDP {

    public static void main(String[] args){
        Long start=System.currentTimeMillis();
        int sum=28;
        int [] coins={1,3,5};
        int[] dp=new int[sum+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        int ans=noOfWays(sum,coins,dp);
        Long end=System.currentTimeMillis();
        System.out.println("Ways to find change ="+ans +"in ms=" +Math.subtractExact(end,start));
    }
    private static int noOfWays(int n, int[] coins,int[] dp) {
        int ans=0;
        if(n<0)
            return 0;
        if (n==0)
            return 1;
        if(dp[n]==-1){
         ans=noOfWays(n-1,coins,dp)+noOfWays(n-3,coins,dp)+noOfWays(n-5,coins,dp);
        dp[n]=ans;
        }
        else{
            return dp[n];
        }
        return ans;
    }
}
