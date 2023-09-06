package com.com.datastructures.dp;

/**
 * Finding solution of factorial of a number using Bottom UP ie tabulation approach
 * We start with smallest possible input argument value. Not actually dp as recursive calls do not exist.
 */
public class FactorialBottomUpDPSolution {


    public static void main(String[] args){
        int n=5;
        int[] dp=new int[n+1];
        dp[0]=1;
        int ans=factorial(n,dp);
        System.out.println("BUP approach ans ="+ans);
    }
    private static int factorial(int n,int[] dp){
        int ans=0;
        for(int i=1;i<=n;i++){
            dp[i]=i*dp[i-1];
            ans=dp[i];
        }
        return ans;
    }
}
