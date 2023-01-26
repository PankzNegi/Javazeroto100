package com.pankz.array;

public class Arrayq2 {
    public static void main(String[] args) {
        int[]arr={2,3,5,89};

        large(arr);

    }
    static void large(int[]array)
    {
        int max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println("largest among array is = "+" "+max);
    }
}
