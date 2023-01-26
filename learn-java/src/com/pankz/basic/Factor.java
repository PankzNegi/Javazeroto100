package com.pankz.basic;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("enter your number");
        num=input.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println("factors are"+" " +i);
            }
        }
    }
}
