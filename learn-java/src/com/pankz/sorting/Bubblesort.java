package com.pankz.sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[]array={3,1,5,4,2};

        bubblesort(array);
        System.out.println(Arrays.toString(array));

    }

    static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}