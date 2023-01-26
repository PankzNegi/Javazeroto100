package com.pankz.search;

public class Searchq2 {
    public static void main(String[] args) {
        int[] array={2,3,-8,6,5,9,45};
       boolean ans= Lsearch(array,1,4,-8);
        System.out.println(ans);
    }
    static boolean Lsearch(int[]arr,int start,int end,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=start;i<=end;i++)
        {
            int element=arr[i];
            if(element==target)
                {
                return true;
        }
        }
        return false;
    }
}
