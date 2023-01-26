package com.pankz.basic;

import java.util.Scanner;

public class hitzerolarge {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=1;
        int large=num;
        while(num!=0) {
            num = input.nextInt();
            if(num>large)
            {
                large=num;
            }
        }
        System.out.println("largest among all is"+" " +large);


        }


    }
