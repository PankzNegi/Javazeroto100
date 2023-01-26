package com.pankz.array;

public class Arrayq3 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,34,12,7};
       int largest= large(arr,2,4);
        System.out.println("largest among this range="+" "+largest);


    }
    static int large(int[]array,int start,int end)
    {
        int max=array[0];
        for(int i=start;i<=end;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;

    }
}
