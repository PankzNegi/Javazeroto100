package com.pankz.basic;

import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many no. you want to input and display");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }


    }
}
