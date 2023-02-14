package com.pankz.Revision;

import java.util.Arrays;

public class cyclicrevisited {
    public static void main(String[] args) {
        int[]array={5,7,1,3,6,2,4};
        cyclic(array);
        System.out.println(Arrays.toString(array));

    }
    static void cyclic(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex])
            {
                swap(arr,i,correctindex);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int [] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
