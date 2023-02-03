package com.pankz.Subset_Subsequence_String_Recursion;
//Same as Q1 here we are not passing local var in the arguments of function
//We will use this in main body and will not use in recursive calls
public class SkipCharacterQ2 {
    public static void main(String[] args) {
        String original="jasadtaas";
        String ans=skipped(original);
        System.out.println(ans);

    }
    static String skipped(String original)
    {
        if(original.isEmpty())
        {
            return "";
        }
        char ch=original.charAt(0);
        if(ch=='a')
        {
            return skipped(original.substring(1));
        }
        else {
            return ch+skipped(original.substring(1));
        }
}}
//Here it will return a string from bottom call to main
//Meanwhile all function call will wait in the stacks