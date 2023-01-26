package com.pankz.basic;

import java.util.Scanner;

public class Whiler{
    public static void main(String[] args) {
        int i=1;
        Scanner input=new Scanner(System.in);
        System.out.println("how many number you want to show");
        int n=input.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }

    }
}

