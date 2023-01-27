package com.pankz.search;

public class Orderagnosticsearch {
    public static void main(String[] args) {
        int[]array={98,78,67,34,23,20,19,7,2,-2,1};
        int answer=binarysearch(array,-2);
        System.out.println(answer);


    }
    static int binarysearch(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
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

