package com.pankz.search;

public class Infinitearraysearch {
    public static void main(String[] args) {
        int[]array={3,5,7,9,10,90,100,130,140,160,170};
        int target=7;
        System.out.println(ans(array,target));


    }

    static int ans(int[]arr,int target)  //function finding the start and end within range
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int newstart =end+1;
            end=end+(end-start)*2;
            start=newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[]arr,int target,int start,int end)  //ordinary binary search
    {

        while(end>=start)
        {
            int mid=start+(end-start+1)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }else if(target<arr[mid])
            {
                end=mid-1;
            }else {return mid;
            }

        } return -1;
    }
}
