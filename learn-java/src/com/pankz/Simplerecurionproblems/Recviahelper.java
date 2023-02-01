package com.pankz.Simplerecurionproblems;



public class Recviahelper {

    public static void main(String[] args) {
         int answer=reverse(6745);
        System.out.println("Reverse of a number is="+answer);


    }
    //"outside" here
    static int reverse(int n) //can pass that variable or "outside" or by helper function
    {
        //sometime we need  an extra variable in the arguments
        //in that case,we make another function known as "helper function"
        //we are using "helper function" to resolve place value issue while reversing a number
        int digits=(int)(Math.log10(n))+1;

        return helper(n,digits);
    }
    private static int helper(int n,int digits) {


        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
