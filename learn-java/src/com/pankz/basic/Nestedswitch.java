package com.pankz.basic;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("enter your emp id or department");
//        int empid=input.nextInt();
//        String dept=input.next();
//        switch (empid){
//            case 1:
//                System.out.println("employeer is pankaj");
//                break;
//            case 2:
//                System.out.println("employeer is shubham");
//                break;
//            case 3:
//                switch(dept)
//                {
//                    case "IT":
//                        System.out.println("belongs to IT");
//                        break;
//                    case "MANAGEMENT":
//                        System.out.println("belongs to management");
//                        break;
//                    default:
//                        System.out.println("invalid department");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("invalid empid");
//        }
        System.out.println("enter day of week");
    int weekday=input.nextInt();
        switch (weekday) {
            case 1, 2, 3, 4, 5 -> System.out.println("this is week day");
            case 6, 7 -> System.out.println("this is weekend");
            default -> System.out.println("invalid input");
        }
}}
