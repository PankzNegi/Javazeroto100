package com.pankz.Basicrecursion;

public class Resolvingmultiplecall {
    public static void main(String[] args) {
        greeting();       //at the end task returned to main

    }
    static void greeting()
    {
        System.out.println("hello there");     //Here one function is calling other and so on

        greeting1();
    }
    static void greeting1()
    {
        System.out.println("hello there");
        greeting2();
    }
    static void greeting2()
    {
        System.out.println("hello there");
        greeting3();
    }
    static void greeting3()
    {
        System.out.println("hello there");
        greeting4();
    }
    static void greeting4()
    {
        System.out.println("hello there");

    }
}
