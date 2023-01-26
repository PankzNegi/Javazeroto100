package com.pankz.basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int num=input.nextInt();
        boolean ans=checkarm(num);
        System.out.println(ans);
    }
    static boolean checkarm(int n)
    {
        int original=n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            sum+=rem*rem*rem;
        }
        if(sum == original)
        {
            return true;
        }
        return false;
    }

}
