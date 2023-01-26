package com.pankz.array;

import java.util.Scanner;

public class Arrayshort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]arr=new int[9];
        for(int i=0;i<arr.length;i++)
        {
           arr[i] =input.nextInt();
        }
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }

    }
}
