package com.pankz.basic;

public class stringinfunction {
    public static void main(String[] args) {
        String message=greeting();
        System.out.println("mesSage is"+ " " +message);

    }
    static String greeting()
    {
        String greet="how are you";
        return greet;
    }
}
