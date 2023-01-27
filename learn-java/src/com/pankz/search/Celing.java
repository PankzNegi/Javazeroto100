package com.pankz.search;

public class Celing {
    public static void main(String[] args) {
        int[]array={2,3,5,7,67,89,210,890,996};
       int answer= binarysearch(array,200);
        System.out.println(answer);

    }
    static int binarysearch(int[]arr,int target) {

        if(target>arr[arr.length-1]) //exception so we are checking only with the last index
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }return start;
    }
}
