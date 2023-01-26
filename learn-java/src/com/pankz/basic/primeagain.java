package com.pankz.basic;

import java.util.Scanner;

public class primeagain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        boolean answer=checkprime(num);
        System.out.println(answer);


    }

    static boolean checkprime(int n)
    {
        int c=2;
        if(n<=1)
        {
            return false;
        }
        while(c<n)
        {
            if(n%c==0)
            {
                return false;

            }c++;
        }
        if(c*c>n)
        {
            return true;
        }
        return false;
    }
}
