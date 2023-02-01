package com.pankz.Simplerecurionproblems;

public class Sumofn {
    public static void main(String[] args) {
        int sum =factorial(50);
        System.out.println("sum up to 50th term is ="+sum);

    }
    static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+factorial(n-1);
    }
}
