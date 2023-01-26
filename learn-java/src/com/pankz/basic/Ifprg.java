package com.pankz.basic;

import java.util.Scanner;

public class Ifprg
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your salary");
        int salary=input.nextInt();
        if(salary<10000)
        {
            salary=salary+2000;

        }else {
            salary=salary+5000;

        }
        System.out.println("new salary is="+salary);
    }

}
