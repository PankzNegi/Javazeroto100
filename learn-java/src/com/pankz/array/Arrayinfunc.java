package com.pankz.array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinfunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]n={2,3,4,5,6,7,8,9};
        modify(n);
        System.out.println(Arrays.toString(n));


    }
        static void modify(int[]arr)
        {
      arr[0]=8;
        }
    }

