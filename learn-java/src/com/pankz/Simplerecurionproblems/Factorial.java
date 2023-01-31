package com.pankz.Simplerecurionproblems;

public class Factorial {
    public static void main(String[] args) {

        int factorial=facto(5);
        System.out.println("factorial of given number is="+factorial);

    }
    static int facto(int n)
    {
        if(n<=1)
        {

            return 1 ;
        }
       return n*facto(n-1);  //function call must be return, as it is returning integer
    }
}
