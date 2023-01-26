package com.pankz.search;

public class Searchq3 {
    public static void main(String[] args) {
        int [] array={2,334,5,1,-678,-45,67,-49};
        min(array);

    }
    static void min(int[]arr)
    {int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
