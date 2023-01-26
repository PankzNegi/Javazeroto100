package com.pankz.basic;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int search;
        System.out.println("enter the number whose occurence you want to chk");
        search=input.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==search){
                count++;
            }
            num=num/10;

        }
        System.out.println("occurance of searched number is="+ " " +count);
    }
}
