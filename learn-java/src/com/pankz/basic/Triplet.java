package com.pankz.basic;

import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();


        Istriplet(num1, num2, num3);


    }
    static void Istriplet(int a, int b,int c)
    {
        int large=c;
        if(a>large)
        {
            large=a;
        }
        else if(b>large) {
            large = b;
        }
        if(large==a) {

            System.out.println((b * b + c * c) == (a * a));

        }

        else if(large==b)
        {
            System.out.println((a*a+c*c)==(b*b));


        }
        else {
            System.out.println((a * a + b * b) == (c * c));
        }

    }
}
