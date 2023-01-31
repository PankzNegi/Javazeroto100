package com.pankz.Basicrecursion;

public class Printingnums {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n)
    {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    static void print5(int n) {
        System.out.println(n);
        print6(6);
    }
    static void print6(int n) {
        System.out.println(n);

    }

}//Here also one function is calling other.But all the function body and definations are same
//All are taking same parameter ans souting callimg....
//So instead of all these function can't we solve it by only one function call
