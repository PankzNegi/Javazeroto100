package com.pankz.sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int []array={7,1,2,5,9,4,3};
        Insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
    static void Insertionsort(int[]arr)
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int[]arr,int first,int second)
    {
        int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
    }}
