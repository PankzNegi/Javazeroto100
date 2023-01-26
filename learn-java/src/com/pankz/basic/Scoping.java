package com.pankz.basic;

public class Scoping {
    public static void main(String[] args) {
        int a=10;
        {
            int b=20;

            int c=30;
            System.out.println(c);
        }
        System.out.println(a);
       // System.out.println("val of c is"+c)

    }


}
