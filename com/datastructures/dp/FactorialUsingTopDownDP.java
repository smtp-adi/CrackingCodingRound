package com.com.datastructures.dp;

import java.util.Arrays;

public class FactorialUsingTopDownDP {

    public static void main(String[] args){
        int n=60;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=1;
        int ans=n*fact(n-1,dp);

        System.out.println("Ans using TDP ="+ans);
        for(int x: dp)
        System.out.print("ans"+x);

    }//[1,1,2,6,24]
    private static int fact(int n,int[] dp){
        int ans=0;
        if (n==0)
            return dp[0];
        if (n==1)
            return dp[1];
        if(n>1){
            if(dp[n-1]!=-1){
                ans=n*dp[n-1];
            }
            else{
                ans=n*fact(n-1,dp);
            }
        }
        dp[n]=ans;
        return ans;
    }
}
