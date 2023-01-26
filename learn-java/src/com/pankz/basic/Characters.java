package com.pankz.basic;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter whole string");
        char ch=input.next().trim().charAt(5);
        if(ch >='a'&& ch <= 'z')
        {
            System.out.println("entered charcter is lowercase");
        }
        else {
            System.out.println("entered case is uppercase");
        }


    }

}
