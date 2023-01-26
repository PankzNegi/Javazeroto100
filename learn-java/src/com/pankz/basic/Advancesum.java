package com.pankz.basic;

import java.util.Scanner;

public class Advancesum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1;
        int neg=0;
        int even=0;
        int odd=0;
        while(n!=0)
        {
            n=input.nextInt();
            if(n<0)
            {
                neg+=n;
            }
            else if(n%2==0)
            {
                even+=n;
            }
            else
                odd+=n;
        }
        System.out.println("sum of negative number is="+" " +neg);
        System.out.println("sum of  even number is="+" " +even);
        System.out.println("sum of odd number is="+" " +odd);
    }
}
