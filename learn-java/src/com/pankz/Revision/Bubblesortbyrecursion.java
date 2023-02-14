package com.pankz.Revision;

import java.util.Arrays;

public class Bubblesortbyrecursion {
    public static void main(String[] args) {
        int[]array={6,1,4,9,7,12,2};
        sorting(array,array.length-1,0);
        System.out.println(Arrays.toString(array));

    }
    static void sorting(int[]arr,int rows,int cols)
    {
        if(rows==0)
        {
            return;
        }
        if(cols<rows)
        {
            if(arr[cols+1]<arr[cols])
            {
                int temp=arr[cols];
                arr[cols]=arr[cols+1];
                arr[cols+1]=temp;
            }
            sorting(arr,rows,cols+1);

        }
        sorting(arr,rows-1,0);
    }
}
