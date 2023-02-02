package com.pankz.RecursioninArrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []array={5,7,9,1,3,4};
        Sort(array,array.length,0,0);
        System.out.println(Arrays.toString(array));

    }

    static void Sort(int[] arr, int row, int cols, int max) {

        {
            if (row == 0) {
                return;
            }
            if (row > cols) {
                if (arr[cols] > arr[max]) {     //code for finding max i.e traversing
                    Sort(arr, row, cols + 1, cols);
                } else {
                    Sort(arr, row, cols + 1, max);
                }
            } else {
                int temp = arr[max];   //swapping
                arr[max] = arr[row - 1];
                arr[row-1] = temp;
                Sort(arr, row - 1, 0, 0);  //assuming index 0 as max as we did in finding max
            }
        }

    }
}

//Instead of swapping while traversing we first maintain what is max in that row
//In linear search we swap while traversing