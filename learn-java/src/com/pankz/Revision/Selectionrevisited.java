package com.pankz.Revision;

import java.util.Arrays;

public class Selectionrevisited {
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 8, 1, 9};
        selection(array);
        System.out.println(Arrays.toString(array));
    }


    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maximum = getmaximum(arr, 0, last);
            swapping(arr, maximum, last);

        }
    }
        static void swapping ( int[] arr, int first, int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        static int getmaximum ( int[] arr, int start, int end)
        {
            int max = start;
            for (int i = start; i <= end; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }
            return max;

        }
    }

