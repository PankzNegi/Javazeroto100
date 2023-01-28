package com.pankz.search;

import java.util.Arrays;

public class Mountainarray {
    public static void main(String[] args) {
        int[] array={1,2,3,5,7,6,3,2};
         int ans=peak(array);
        System.out.println(ans);

    }
    static int peak(int[]arr)
    {
       int  start=0;
       int end=arr.length-1;
       while(start<end)
       {
           int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1]) //decreasing part of an array this might be one ans look lhs
           {
               end=mid;
           }
           else {
               start=mid+1; //ascending part look rhs
           }
       } return arr[start];    //condition of loop break one stage arrived when start=mid=end and poiniting to maximum element.
    }                           //can return end as well
}
