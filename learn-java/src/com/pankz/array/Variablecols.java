package com.pankz.array;

import java.util.Arrays;
import java.util.Scanner;

public class Variablecols {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]arr={{1,2,3},{4,5,6,7},{8,9}};
        for(int i=0;i<arr.length;i++)

           // for(int j=0;j<arr[i].length;j++)
            {


                System.out.println(Arrays.toString(arr[i]));
            }



        }
    }

