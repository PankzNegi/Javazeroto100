package com.pankz.Revision;

import java.util.Arrays;

public class Bubblesortrevisited {
    public static void main(String[] args) {
        int[]array={5,4,2,8,3,1};
        bubble(array);
        System.out.println(Arrays.toString(array));

    }
    static void bubble(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
