package com.pankz.basic;


import java.util.Scanner;
    public class Loopsecond {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("enter the salary");
            int salary=input.nextInt();
            if(salary<100000){
                salary+=2000;
            }else if(salary<200000){
                salary+=4000;
            }
            else {
                salary+=3000;
            }
            System.out.println("new salary="+salary);

        }
    }

