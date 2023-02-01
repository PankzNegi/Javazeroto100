package com.pankz.Simplerecurionproblems;


public class Pallindrome {
    public static void main(String[] args) {
       boolean answer=checkPallindrome(12721);
        System.out.println("condition for pallindrome is"+ " " +answer);

    }
    static boolean checkPallindrome(int n)
    {
        if(n==0)
        {
            return false;
        }
        if(n==reverse(n))
        {
            return true;
        }
        return false;
    }
    static int reverse(int n)
    {
        int placevalue=(int)(Math.log10(n))+1;
        return helper(n,placevalue);
    }
    private static int helper(int n,int placevalue)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,placevalue-1))+helper(n/10,placevalue-1);
    }
}

