package com.pankz;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1, input2;
        String userChoice = null;
        do {
            System.out.println("Welcome");
            System.out.println("1-Addition");
            System.out.println("2-Subtraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("5-Exit");
            int choice;
            System.out.println("Enter your choice of operation");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter value1");
                    input1 = sc.nextInt();
                    System.out.println("Enter value2");
                    input2 = sc.nextInt();
                    System.out.println("sum of given inputs is" + (input1 + input2));
                    break;
                }
                case 2: {
                    System.out.println("Enter value1");
                    input1 = sc.nextInt();
                    System.out.println("Enter value2");
                    input2 = sc.nextInt();
                    System.out.println("diff of given inputs is" + (input1 - input2));
                    break;
                }
                case 3: {
                    System.out.println("Enter value1");
                    input1 = sc.nextInt();
                    System.out.println("Enter value2");
                    input2 = sc.nextInt();
                    System.out.println("multiplication of given inputs is" + (input1 * input2));
                    break;
                }
                case 4: {
                    System.out.println("Enter value1");
                    input1 = sc.nextInt();
                    System.out.println("Enter value2");
                    input2 = sc.nextInt();
                    System.out.println("division of given inputs is" + (input1 / input2));
                    break;
                }
                case 5: {
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    break;

            }
            System.out.println("Do you want to continue further (Yes/No)");
            userChoice = sc.next();
        }

        while (userChoice.equalsIgnoreCase("yes"));

    }
}

