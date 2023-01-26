package com.pankz.basic;

import java.util.Scanner;

public class zerohit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
     int num=1;
//        System.out.println("enter numbers");
//     num=input.nextInt();
     while(num !=0)
     {

         num=input.nextInt();
         sum=sum+num;


     }

        System.out.println("sum is" + " " + sum);
    }
    }


