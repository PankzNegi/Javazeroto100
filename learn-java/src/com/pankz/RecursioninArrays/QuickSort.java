package com.pankz.RecursioninArrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]array={3,4,5,1,7,2};
        Sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));   //not returning any array only modifying the array

    }
    static void Sort(int[]arr,int low,int high)
    {
        if(low>=high)    //Violation in the remaining partion ( same as violation in full array as start<=end)
        {
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end)
        {
            while(arr[start]<pivot) {   //Putting pivot at correct index
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<=end)
            {                                 //If pivot is not at correct index,just swap
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        } //loop terminates when end>start at the end it will be as low/high base condition
        //now pivot is at correct index
        Sort(arr,low,end);
        Sort(arr,start,high);
    }
}
//Quick sort is not stable
//Quick sort is inplace(no extra space as in merge sort)
