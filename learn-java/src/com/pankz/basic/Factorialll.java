package com.pankz.basic;

import java.util.Scanner;

public class Factorialll {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        Factorial(num);

    }
    static void Factorial(int n)
    {
        for(int i=n-1;i>=1;i--)
        {
            n*=i;
        }
        System.out.println("factorial of a number is"+" " +n);

    }
}
