package com.pankz.RecursioninArrays;
//Check whether the array is sorted or not by recursion
public class Q1SortedArraycheck {
    public static void main(String[] args) {
        int[]array={10,12,349,78,90,123,236};
        boolean answer =checksorted(array);
        System.out.println(answer);

    }
    static boolean checksorted(int[]arr)
    {
        int i=0;      //i here index value
        return helper(arr,i);
    }
    private static boolean helper(int[]arr,int i)    //We can skip this function
    {
        if(i==arr.length-1)
        {
            return true;
        }
       return (arr[i]<arr[i+1] && helper(arr,i+1));

    }
}
//We can skip  helper function and pass the index arguments in the function itself