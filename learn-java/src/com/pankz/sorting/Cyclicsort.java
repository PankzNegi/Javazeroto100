package com.pankz.sorting;

import java.util.Arrays;

public class Cyclicsort {

    public static void main(String[] args) {
        int[]array={5,9,2,1,12,8,4,6,7,10,11,3};
        Cyclicsort(array);
        System.out.println(Arrays.toString(array));

    }
    static void Cyclicsort(int[]arr)
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
    static void swap(int[]arr,int first,int second)
    {
        int temp;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
