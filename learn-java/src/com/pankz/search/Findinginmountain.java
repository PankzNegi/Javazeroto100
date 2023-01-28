package com.pankz.search;

public class Findinginmountain {
    public static void main(String[] args) {
        int[]array={1,2,3,5,6,4,3,2};
        int target=6;

        int ans=Findpeak(array,target);
        System.out.println(ans);

    }
    static int Findpeak(int[]arr,int target) {
        int peak = peak(arr);
        int Firstsearch = agnosticbinarysearch(arr, target, 0, peak);
        int Secondsearch = agnosticbinarysearch(arr, target, peak, arr.length - 1);
        if (Firstsearch != -1) {
            return Firstsearch;
        }
        return Secondsearch;
    }
    static int peak(int[]arr)
    {
        int  start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) //decreasing part of an array this might be one ans look lhs
            {
                end=mid;
            }
            else {
                start=mid+1; //ascending part look rhs
            }
        } return start;    //condition of loop break one stage arrived when start=mid=end and poiniting to maximum element.
    }                           //can return end as well



static int agnosticbinarysearch(int[]arr,int target,int start,int end)  //binary search acc to ASC or DESC
{

    //find whether the array is in ASC OR DESC
    boolean isasc;
    isasc = arr[start] < arr[end];
    while(end>=start)
    {
        int mid=start+(end-start)/2;
        if(arr[mid]==target) //we write this before becoz this is condition is commom for ASC or DESC
        {
            return mid;
        }
        if(isasc) {
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        else{
            if(target>arr[mid])   //for DESC order
            {
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
    }return -1;
}
}
