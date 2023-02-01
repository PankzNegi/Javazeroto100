package com.pankz.Simplerecurionproblems;

public class Reverseofnumber {
    public static void main(String[] args) {
       reverse(7215 );
        System.out.println(rev);

    }

    static int rev=0;
    static void reverse(int n )
    {
        if(n==0)
        {
            return ;
        }

         rev=rev*10 +n%10;
        reverse(n/10);
    }
}
