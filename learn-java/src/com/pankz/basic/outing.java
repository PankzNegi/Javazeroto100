package com.pankz.basic;

import java.util.Scanner;

public class outing {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tot_days;
        System.out.println("enter total days in august");
        tot_days=input.nextInt();
        int count=0;
        for(int i =1;i<=tot_days;i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("outing days="+" " +count);


}}
