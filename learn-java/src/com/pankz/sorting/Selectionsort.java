package com.pankz.sorting;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[]array={7,8,1,2,3,5};
         Selectionsort(array);
        System.out.println(Arrays.toString(array));
    }
    static void Selectionsort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getmaximum(arr,0, last);
            swap(arr, max, last);
        }
    }
        static void swap(int[]arr,int first,int second)
        {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        static int getmaximum(int[]arr,int start,int end)
        {
            int maximum=start;
            for (int i=start;i<=end;i++)
            {
            if(arr[i]>arr[maximum])

                maximum=i;

            }return maximum;
        }
   }

