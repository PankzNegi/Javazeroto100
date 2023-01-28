package com.pankz.search;

public class RotatedBinarysearch {
    public static void main(String[] args) {
        int[] array={4,5,6,7,0,1,2,3,};
        int Pivot=getPivot(array);
        System.out.println("pivot element is ="+ " "+Pivot);

    }
    static int getPivot(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start/2);
            if(mid<end&& arr[mid]>arr[mid+1]) //possible answers
            {
                return arr[mid];
            }
            if(mid>start && arr[mid]<arr[mid-1])  //possible answers
            {
                return arr[mid-1];

            }
            if(arr[mid]<=arr[start])   //checking conditions for first if above two cases fails
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        } return -1;
    }
}
