package com.com.datastructures.dp;


class UglyNumbersDPApproach{
    public static void main(String[] args) {
        int n=5;
        System.out.println("Nth ugly number is :"+ nthUglyNumber(n));
    }
    static int nthUglyNumber(int n){
        int[] ugly=new int[n];
        ugly[0]=1;
        int i2=0;
        int i3=0;
        int i5=0;
        int next_multiple_of_2=2;
        int next_multiple_of_3=3;
        int next_multiple_of_5=5;
        int next_ugly_number=1;
       // ugly[0]=min(next_multiple_of_2,next_multiple_of_3,next_multiple_of_5);
        for(int i=1;i<n;i++){
            next_ugly_number= min(next_multiple_of_2,next_multiple_of_3,next_multiple_of_5);
            ugly[i]=next_ugly_number;
            if(next_ugly_number==next_multiple_of_2){
                i2=i2+1;
                next_multiple_of_2=ugly[i2]*2;
            }
            if(next_ugly_number==next_multiple_of_3){
                i3=i3+1;
                next_multiple_of_3=ugly[i3]*3;
            }
            if(next_ugly_number==next_multiple_of_5){
                i5=i5+1;
                next_multiple_of_5=ugly[i5]*5;
            }
        }
        return next_ugly_number;
    }
    static int min(int a,int b,int c){

        if(a<=b && a<=c)
            return a;
        else if(b<=a && b<=c)
            return b;
        else
            return c;

    }

}


