package com.pankz.RecursioninArrays;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[]array={1,3,6,7,8,7,9,7};
        System.out.println( Linearsearch(array,7,0,new ArrayList<>()));

    }
    static ArrayList<Integer> Linearsearch(int[]arr, int target, int i, ArrayList<Integer>list)
    {
        if(i==arr.length)
        {
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        return Linearsearch(arr,target,i+1,list);

    }
}
