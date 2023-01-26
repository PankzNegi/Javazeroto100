package com.pankz.basic;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your fruit");
        String fruit=input.next();
        switch(fruit)
        {
            case "Mango":
            {
                System.out.println("fruit is mango");
                break;
            }
            case "apple":
            {
                System.out.println("fruit is apple");
                break;
            }
            default:
                System.out.println("invalid input");
        }
//    if(fruit.equals("mango")){
//        System.out.println("fruit is mango");
//    }
//        if (fruit.equals("apple")) {
//            System.out.println("fruit is apple");
//        }
        }
}
