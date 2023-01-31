package com.pankz.Simplerecurionproblems;

public class onetoN {
    public static void main(String[] args) {
        print(5);

    }
    static void print(int n)
    {
        if(n==1)   //base condition to stop repetitive function call
        {
            System.out.println(1);
            return;
        }

        print(n-1); //when the function call finish executing then print
        System.out.println(n);
    }
}
//given N=5 instead of printing 5 first print 1 ,2,3,4

