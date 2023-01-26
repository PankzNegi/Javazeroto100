package com.pankz.basic;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
       vararg(10,20,"ajay","mohit","chaman","deepu","rax");


    }
    static void vararg(int a,int b,String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
