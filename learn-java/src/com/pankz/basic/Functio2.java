package com.pankz.basic;

import java.util.Scanner;

public class Functio2 {
    public static void main(String[] args) {

   int ans=total();
        System.out.println("sum of two number is"+" " +ans);
    }
    static int total()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        int sum=a+b;
        return sum;

    }

}

