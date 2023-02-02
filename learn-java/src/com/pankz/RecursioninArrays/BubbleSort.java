package com.pankz.RecursioninArrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []array={5,8,7,6,2,3,1};
        bubble(array,array.length-1,0); //here row initially at 6
        System.out.println(Arrays.toString(array));

    }
    static void bubble(int[]arr,int row,int cols)
    {
        if(row==0)
        {
            return;
        }
        if(row>cols)
        {
            if(arr[cols]>arr[cols+1])
            {
                int temp=arr[cols];
                arr[cols]=arr[cols+1];  //swapping
                arr[cols+1]=temp;
            }
            bubble(arr,row, cols+1);
        }
        else {
            bubble(arr,row-1,0);
        }
    }
}
