package com.com.datastructures.dp;

class MatrixMultiplicationBruteForce{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        int n=arr.length;
        System.out.println(minMultiplications(arr,1,n-1));
    }
    static int minMultiplications(int[]p, int i,int j){
        int min=Integer.MAX_VALUE;
        if(i==j)
            return 0;
        for(int k=i; k<j;k++){

            int count= minMultiplications(p,i,k)+minMultiplications(p,k+1,j)+p[i-1]*p[k]*p[j];
            if(count < min){
                min=count;
            }
        }
        return min;
    }
}