package com.pankz.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayObject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=new String[4];
        for(int i=0;i<str.length;i++)
        {
            str[i]=input.next();
        }
        str[0]="negi";// we can modify thr string
        System.out.println(Arrays.toString(str));

    }
}
