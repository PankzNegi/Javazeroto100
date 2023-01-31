package com.pankz.Simplerecurionproblems;

public class Nto1 {
    public static void main(String[] args) {
        print(5);  //If N is given 5;


    }
    static void print(int n)
    {
        if(n==1)   //base condition to stop repetitive function call
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);    //tail recursion
    }
}
