package com.pankz.basic;

public class Methodoverloading {
    public static void main(String[] args) {
        sum(20,30);
        sum(12,23,34);

    }
    static void sum(int a,int b)
    {
        int sum=a+b;
        System.out.println("sum is="+" " +sum);
    }
    static void sum(int num1,int num2,int num3)
    {
        int sum=num1+num2+num3;
        System.out.println("sum is"+ " "+sum);
    }
}
