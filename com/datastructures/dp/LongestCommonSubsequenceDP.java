package com.com.datastructures.dp;

class LongestCommonSubSequenceDP{
    public static void main(String[] args) {
        String aa="aaabbb";
        String bb="aaabccc";
        char[] X=aa.toCharArray();
        char[] Y=bb.toCharArray();
        int m=X.length;
        int n=Y.length;

        System.out.println(LIS(X,Y,m,n));

    }
    static int LIS(char[] X,char[] Y,int m,int n){
        int[][] L=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    L[i][j]=0;
                else if(X[i-1]==Y[j-1]){
                    L[i][j]=1+L[i-1][j-1];
                }
                else{
                    L[i][j]=max(L[i-1][j],L[i][j-1]);
                }
            }
        }
        return L[m][n];
    }
    static int max(int a, int b){
        return a>b?a:b;
    }
}