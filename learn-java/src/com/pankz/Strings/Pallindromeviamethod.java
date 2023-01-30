package com.pankz.Strings;

public class Pallindromeviamethod {
    public static void main(String[] args) {
        String original="radar";
        StringBuilder builder=new StringBuilder(original);
        String reversed= String.valueOf(builder.reverse());
        System.out.println(original.equals(reversed));





    }
}
