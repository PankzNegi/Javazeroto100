package com.pankz.Simplerecurionproblems;

public class Helperfunction {
    public static void main(String[] args) {
        int answer=reverse(3759);
        System.out.println("reverse of this number is ="+answer);

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
