package com.pankz.search;

import java.util.Arrays;

public class FirstNlastoccurance{
    public static void main(String[] args) {

        int []array={5,7,7,8,8,10};
        int []occur=searchnew(array,8);
        System.out.println(Arrays.toString(occur));

    }
    //checking first occurence of target
    static int[] searchnew(int[]num,int target) {
        int[] ans = {-1,-1};
        int start = search(num, target, true);

        int end = search(num, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }
//function return the index value of target
    static int search(int[]num,int target,boolean firstoccurances)
    {
        int ans=-1;
        int start=0;
        int end=num.length-1;
        while(start<=end)
        {
            int mid;
            mid=start+(end-start)/2;
            if(target>num[mid])
            {
                start=mid+1;
            }else if(target<num[mid]) {
                end=mid-1;}
            else{
            ans=mid;
            if(firstoccurances)
            {
                end=mid-1;
            }else {
                start = mid + 1;
            }


            }//potential ans
        } return ans;
    }
}

