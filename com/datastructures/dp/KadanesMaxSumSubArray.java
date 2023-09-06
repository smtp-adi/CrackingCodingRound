package com.com.datastructures.dp;

public class KadanesMaxSumSubArray {

    public static void main(String[] args) {
        int[] arr ={-5,4,6,-3,4,-1};
        System.out.println(findSubArrayMaxSum(arr));
    }
    private static int findSubArrayMaxSum(int[] a){
        int maxSum=0;
        int currSum=0;

        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            if(currSum<0)
                currSum=0;
            if(currSum> maxSum)
                maxSum=currSum;

        }
        return maxSum;

    }

}
