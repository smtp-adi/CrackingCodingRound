package com.com.datastructures.dp;

/**
 * No of ways we can get a given sum using coins []
 */


public class NoOfWaysToReachSumRecursive {

    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        int coins[] = {1, 3, 5};
        int sum = 28;
        int ans = noOfWays(sum, coins);
        Long end=System.currentTimeMillis();
        System.out.println("Ways to find change ="+ans +"in ms=" +Math.subtractExact(end,start));
    }

    private static int noOfWays(int sum, int[] coins) {
        int ans=0;
        if(sum<0)
            return 0;
        if(sum==0) return 1;
            ans = noOfWays(sum - 1, coins) + noOfWays(sum - 5, coins) + noOfWays(sum - 3, coins);
        return ans;

    }
}
