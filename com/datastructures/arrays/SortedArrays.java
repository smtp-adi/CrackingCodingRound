package com.com.datastructures.arrays;

public class SortedArrays {

    /**
     * given an array in non-decreasing order of elements
     * return a result array with non decreasing order of
     * squares of element of input array.
     */
    public static void main(String[] args) {
        int arr[] = {-10000,-9999,-7,-5,0,0,10000};
        int[] ans = sortedSquares(arr);
        System.out.println(ans);
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        if(nums[0]>=0){
            for(int i=0;i<nums.length;i++)
            {
                result[i]=nums[i]*nums[i];
            }
        }
        else{

            int i=0;
            if(nums.length>1){

                while( i+1<nums.length && nums[i+1]<0){
                    i++;
                }
                if(i<nums.length -1){
                    int j=i+1;//2 3 4
                    System.out.println("i--->j"+i+"--->"+j);
                    int k;
                    for(k=0;k<result.length;k++){

                        if(nums[i]*nums[i]>=nums[j]*nums[j]){
                            result[k]= nums[j]*nums[j];
                            if(j<nums.length)
                                j++;
                            else{
                                break;
                            }

                        }
                        else if(nums[i]*nums[i]<=nums[j]*nums[j]){
                            result[k]= nums[i]*nums[i];
                            if(i>0)
                                i--;
                            else{
                                break;
                            }

                        }

                    }
                    if(i>0){
                        while(i!=0){
                            k++;
                            result[k]=nums[i]*nums[i];
                            i--;
                        }
                    }
                    if(j<nums.length){
                        while(j<nums.length){
                            k++;
                            result[k]=nums[j]*nums[j];
                            j++;
                        }
                    }
                    return result;
                }
                else{

                    int f=nums.length-1;
                    for(int d=0;d<nums.length;d++){
                        result[f]=nums[d]*nums[d];
                        f--;

                    }
                }

            }
            else{
                result[0]=nums[0]*nums[0];
            }


        }
        return result;
    }
}
