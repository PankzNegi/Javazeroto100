package com.pankz.basic;

public class Shadowing {
    static int x=40;
    public static void main(String[] args) {
        System.out.println("val of x in main is"+x);
     int x=60;
        System.out.println("val of x in main again  is"+x);
        fun();

    }
    static void fun()
    {
        System.out.println("val of x is ="+x);
    }

}

// In shadowing upper value overide the lower value