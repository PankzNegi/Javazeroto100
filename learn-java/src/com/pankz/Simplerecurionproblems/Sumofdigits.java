package com.pankz.Simplerecurionproblems;

public class Sumofdigits {
    public static void main(String[] args) {
       int sum= digitsum(2578);
        System.out.println(sum);

    }
    static int digitsum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return(n%10)+digitsum(n/10);
    }
}
