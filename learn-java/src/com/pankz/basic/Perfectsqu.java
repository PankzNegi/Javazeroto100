package com.pankz.basic;

import java.util.Scanner;

public class Perfectsqu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("enter your number");
        num=input.nextInt();
        for(int i=1;i*i<=num;i++)
        {
            if(i*i==num)
            {
                System.out.println("perfect");
                return;


            }




        }
        System.out.println("not perfect");








    } }

