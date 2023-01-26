package com.pankz.basic;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1;
        int num2;
        int lcm;
        int hcf;

        System.out.println("enter number first");
        num1=input.nextInt();
        System.out.println("enter second number");
        num2=input.nextInt();
       lcm=(num1>num2)? num1:num2;

       while(true)
        {
            if(lcm%num1==0 && lcm%num2==0)
            {
                System.out.println("lcm of two number is=" + " "+lcm);
                hcf=(num1*num2)/lcm;

                break;
            }
++lcm;


        }
        System.out.println("hcf of two number is="+" "+hcf);
    }
}
