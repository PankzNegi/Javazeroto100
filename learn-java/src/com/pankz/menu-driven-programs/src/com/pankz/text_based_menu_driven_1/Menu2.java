package com.pankz.text_based_menu_driven_1;

import java.util.Scanner;

public class Menu2 {
    public static void displayMenu(int[] opts, String[] items, double[] cost) {
        System.out.println("M E N U");
        System.out.println("==========");
        for (int i = 0; i < opts.length - 1; i++) {
            System.out.printf("%d. %s \t %.2f\n", opts[i], items[i], cost[i]);
        }
        System.out.printf("%d. %s\n", opts[opts.length - 1], items[items.length - 1]);//printing exit option

        System.out.println("================");
        System.out.print("Please Enter your choice");

    }

    public static void main(String[] args) {
        int choice;
        int[] options = {1, 2, 3, 4, 5};
        String[] menuItems = {"Americano", "Latte", "Espresso", "Cappuccino", "Exit"};
        double prices[] = {110, 120, 150, 240};
        int EXIT = options[options.length - 1];
        displayMenu(options, menuItems, prices);

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        while (choice != EXIT) {
            if (choice == options[0]) {
                System.out.printf("%s coffee %.2f\n", menuItems[0], prices[0]);
            } else if (choice == options[1]) {
                System.out.printf("%s coffee %.2f\n", menuItems[1], prices[1]);

            } else if (choice == options[2]) {
                System.out.printf("%s coffee %.2f\n", menuItems[2], prices[2]);

            } else if (choice == options[3]) {
                System.out.printf("%s coffee %.2f\n", menuItems[3], prices[3]);

            }
            displayMenu(options, menuItems, prices);
            choice = sc.nextInt();
        }
        System.out.println("Call again");

    }
}

