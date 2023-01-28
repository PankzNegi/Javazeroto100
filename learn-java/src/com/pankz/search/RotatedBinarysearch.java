package com.pankz.search;

public class RotatedBinarysearch {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2,3};
        int Pivot = getPivot(array);
        System.out.println("pivot element is =" + " " + Pivot);
        int searched_element=search(array,0);
        System.out.println("searched element is at index"+ " "+searched_element);

    }

    static int search(int[] arr, int target)   //function for searching in rotated binary araay after getting pivot
    {
        int pivot = getPivot(arr);
        //if pivot is not found then array is not rotated
        if (pivot == -1) {
            return binarysearch(arr, target, 0, arr.length - 1);//then do normal binary search
        }
        //If pivot is found then do saerching in ASC order arrays
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target>= arr[0]) {
            return binarysearch(arr, target, 0, pivot - 1);
        } else {
            return binarysearch(arr, target, pivot + 1, arr.length-1 );
        }
    }



    static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int getPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/ 2;
            if (mid < end && arr[mid] > arr[mid + 1]) //possible answers
            {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1])  //possible answers
            {
                return mid - 1;

            }
            if (arr[mid] <= arr[start])   //checking conditions for first if above two cases fails
            {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }}