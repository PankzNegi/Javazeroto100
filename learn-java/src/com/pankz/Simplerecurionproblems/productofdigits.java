package com.pankz.Simplerecurionproblems;

public class productofdigits {
    public static void main(String[] args) {
        int answer=product(1562);
        System.out.println(answer);

    }
    static int product(int n)
    {
        if(n%10==n)                          //If only one digit is remaiming then return that digit
        {
            return n;
        }
        return n%10*product(n/10);
    }
}
