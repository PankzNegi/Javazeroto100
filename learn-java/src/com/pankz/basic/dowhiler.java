package com.pankz.basic;

import java.util.Scanner;

public class dowhiler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many number you want to display");
        int i=1;
        int n=input.nextInt();
        do {
            System.out.println(i);
            i++;
        } while(i<=n);
        }
    }

