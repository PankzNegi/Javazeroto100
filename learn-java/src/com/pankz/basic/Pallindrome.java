package com.pankz.basic;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int reversed=0;
        int rem;
        int num;
        int original;

        System.out.println("enter original number");
        num=input.nextInt();
        original=num;
        while(num>0)
        {
            rem=num%10;

            num/=10;
            reversed=reversed*10+rem;

        }
        System.out.println("reversed number is="+"" +reversed);
        if(reversed==original)
        {
            System.out.println("entered number is pallindrome");
        }
        else System.out.println("the number is not pallindrome");
    }
}
