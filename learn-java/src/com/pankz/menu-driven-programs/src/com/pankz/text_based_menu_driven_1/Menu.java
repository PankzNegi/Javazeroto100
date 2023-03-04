package com.pankz.text_based_menu_driven_1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        System.out.println("M E N U");
        System.out.println("==========");
        System.out.println("1.Americano");
        System.out.println("2. Latte");
        System.out.println("3. Espresso");
        System.out.println("4. Exit");
        System.out.println("================");
        System.out.print("Please Enter your choice");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1: {
                    System.out.println("Americano coffee");
                    break;
                }
                case 2: {
                    System.out.println("Latte");
                    break;
                }
                case 3: {
                    System.out.println("Espresso");
                    break;
                }
//              case 4: {
//                   System.out.println("Goodbyee,call again!!!!");
//                   break;
//                }
                default:
                    System.out.println("Invalid input");
                    break;
            }


            System.out.println("M E N U");
            System.out.println("==========");
            System.out.println("1.Americano");
            System.out.println("2. Latte");
            System.out.println("3. Espresso");
            System.out.println("4. Exit");
            System.out.println("================");
            System.out.print("Please Enter your choice");
            choice = sc.nextInt();
        }
        System.out.println("Call again");

    }
}