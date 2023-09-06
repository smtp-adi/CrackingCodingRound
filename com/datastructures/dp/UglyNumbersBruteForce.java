package com.com.datastructures.dp;

/**
 * Ugly numbers are numbers whose prime factors are 2,3, or 5 only and 1 is ugly by convention.
 * Give n find the nth ugly number. ex for n=7 8 is the 7th ugly number.
 */
public class UglyNumbersBruteForce {
    public static void main(String[] args) {
        System.out.println("Find the nth ugly number");
        int n=7;
        int ans=getTheNethUglyNumer(n);
        System.out.println("Nth Ugly number is :"+ans);

    }
    private static int getTheNethUglyNumer(int n){
        int i=1;
        int uglyNumberCount=1;
        while(uglyNumberCount<n) {
            i++;
            if(isUgly(i)==1){
                uglyNumberCount++;
            }

        }
     return i;
    }
    private static int isUgly(int no){
         no = divideByMaxPower(no,2);
         no = divideByMaxPower(no,3);
         no = divideByMaxPower(no,5);
         return  no==1 ? 1 : 0;
    }

   private static int divideByMaxPower(int a,int b){
        while(a%b==0){
            a=a/b;
        }
        return a;
   }


}
