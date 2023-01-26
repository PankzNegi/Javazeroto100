package com.pankz.basic;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter string");
        String str=input.next();
        int vowel=0;
        int consonent=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowel++;
            }
            else consonent++;

        }
        System.out.println("number of vowel="+ " "+vowel);
        System.out.println("number of consonents="+ " "+consonent);
    }
}
