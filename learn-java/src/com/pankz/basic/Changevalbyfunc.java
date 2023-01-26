package com.pankz.basic;

import java.util.Arrays;

public class Changevalbyfunc {
    public static void main(String[] args) {
        int[]array={10,20,30,40,50};
        change(array);
        System.out.println("new array is"+ " " + Arrays.toString(array));

    }
    static void change(int[]arr)
    {
        arr[0]=99;
    }
}
