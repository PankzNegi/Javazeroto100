package com.pankz.OOPS.Exceptionhandling;

public class UncheckedException {
    public static void main(String[] args) {
        String name=null;
        printLength(name); //But this code will explode at run time and throw nullpointerexception

    }
    private static void printLength(String myString)
    {
        try {
            System.out.println(myString.length());
        } catch (Exception e) {
            System.out.println("String can't be null");
        }
    }
}
