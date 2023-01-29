package com.pankz.search;

public class Rotationalcount {
    public static void main(String[] args) {

        int[]arr={4,5,6,7,0,1,2};
        System.out.println(countrotation(arr));
    }
    static int countrotation(int[]arr)
    {
        int pivot=getPivot(arr); //we are assuming array with no duplicates

        return pivot+1;
    }

//function if no duplicates
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
    }
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
