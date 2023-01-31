package com.pankz.Basicrecursion;

public class Binarysearch {
    public static void main(String[] args) {
        int[]array={2,5,7,70,89,112,678};
         int answer=Bsearch(array,0,array.length-1,112);
        System.out.println( "searched element is at index"+" " +answer);

    }
    static int Bsearch(int[]arr,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
            //"make sure you return every function call if u h've return type"
            return Bsearch(arr,start,mid-1,target) ;     //search on LHS      // same but by recusive call end=mid -1;

        }
        return Bsearch(arr,mid+1,end,target);   //otherwise search RHS
    }
}
