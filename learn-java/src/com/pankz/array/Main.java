package com.pankz.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] roll=new int[6];
        for(int i=0;i<roll.length;i++)
        {
            roll[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(roll));

}  }