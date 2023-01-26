package com.pankz.basic;

import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many number you want to enter");
      int num=input.nextInt();
        int ans=summation(num);
        System.out.println("sum of n number is="+" "+ans);
    }
    static int summation(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

}
