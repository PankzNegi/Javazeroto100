package com.pankz.search;

public class RotatedBinarywithduplicates {
    public static void main(String[] args) {
        int[] array = {2,9,2,2,2};
        int Pivot = getPivotduplicates(array);
        System.out.println("pivot element is =" + " " + Pivot);
        int searched_element=search(array,9);
        System.out.println("searched element is at index"+ " "+searched_element);


    }
    static int search(int[] arr, int target)   //function for searching in rotated binary araay after getting pivot
    {
        int pivot = getPivotduplicates(arr);
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
//function when duplicates contain
    static int getPivotduplicates(int[] arr) {
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
           //if elements at S,M,E are equals skip the duplicates
            if(arr[mid]==arr[start]&& arr[mid]==arr[end])
            {
                //skip the duplicates but can be possible that what we are skipping is pivot
                ///check if start is pivot
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start=start+1;
                //check if end is pivot
                if(arr[end]<arr[end-1])               //start &end is pivot logics are same as above
                {
                    return end-1;
                }
                end=end-1;
            } else if(arr[start]<arr[mid]|| arr[start]==arr[mid]&& arr[mid]>arr[end])
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
