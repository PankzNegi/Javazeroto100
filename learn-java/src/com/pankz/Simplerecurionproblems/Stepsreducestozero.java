package com.pankz.Simplerecurionproblems;

public class Stepsreducestozero {
    public static void main(String[] args) {
       int steps= Countsteps(120);
        System.out.println(steps);



    }
    public static int Countsteps(int n)
    {
        return helper(n,0);
    }
    private static int helper(int n,int c)   //c for steps
    {
        if(n==0)  //last step
        {
            return c;
        }
        if(n%2==0)
        {
            return helper(n/2,c+1);  //dividing is one step
        }
        return helper(n-1,c+1);      //odd no then subtract is one step
    }
}
