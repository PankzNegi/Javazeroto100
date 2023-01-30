package com.pankz.Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String str="apqrtwer";
        System.out.println(isPallindrome(str));

    }
    static boolean isPallindrome(String str)
    {
        str =str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-i-1);
            if(start!=end)
            {
                return false;
            }

        } return true;
    }
}
