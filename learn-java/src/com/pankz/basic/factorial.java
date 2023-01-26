package com.pankz.basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num = input.nextInt();
        for (int i = num - 1; i >= 1; i--) {
            num *= i;

        }
        System.out.println("Factorial of number is=" + " " + num);
    }
}
