package com.pankz.basic;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int rem;
        int sum=0;
        int product=1;
        int diff=0;
        System.out.println("enter your number");
        num=input.nextInt();
        while(num>0)
        {
            rem=num%10;
            num/=   10;
            sum+=rem;
            product*=rem;
            diff=product-sum;

        }
        System.out.println("difference between product and their sum is="+" "+diff);
    }
}
