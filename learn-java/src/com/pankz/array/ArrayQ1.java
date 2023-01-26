package com.pankz.array;

import java.util.Arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        swap(arr,3,4);
    }
    static void swap(int[] array,int i,int j)
    {
        int temp=array[3];
        array[3]=array[4];
        array[4]=temp;
        System.out.println(Arrays.toString(array));
    }
}
