package com.pankz.RecursioninArrays;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]array={5,2,1,9,8,6};
         array=mergesort(array);
        System.out.println(Arrays.toString(array));

    }
    static int[] mergesort(int[]arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int []left= mergesort(Arrays.copyOfRange(arr,0,mid));
        int[]right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[]first,int[]second)
    {
        int[]mix=new int[first.length+second.length];
        int i=0;                               //Pointer for left array
        int j=0;                               //Pointer for right array
        int k=0;                               //Pointer for mixed array
        while(i<first.length&& j<second.length)       //checking boundation
        {
            if(first[i]<second[j])    //merging
            {
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            } k++;    //incrementing pointer of mixed array after updation

        }
        while(i<first.length)       //if any of the array elements left/right  still left??
        {
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        } return mix;
    }
}
