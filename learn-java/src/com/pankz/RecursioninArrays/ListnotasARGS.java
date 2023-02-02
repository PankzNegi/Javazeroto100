package com.pankz.RecursioninArrays;

import java.util.ArrayList;

public class ListnotasARGS {
    public static void main(String[] args) {
        int[]array={1,2,4,6,7,7,8,9};
        ArrayList<Integer> ans=Linearsearch(array,7,0);
        System.out.println(ans);

    }
    static ArrayList Linearsearch(int[]arr,int target,int i)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length)
        {
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        ArrayList<Integer> answer=Linearsearch(arr,target,i+1);
        list.addAll(answer);
        return list;
    }
}
