package com.pankz.Subset_Subsequence_String_Recursion;

public class Q3SkipString {
    public static void main(String[] args) {
        String original ="dishoneytu";
        String ans=Skipstring(original);
        System.out.println(ans);

    }
    static String Skipstring(String original)
    {

        if(original.isEmpty())
        {
            return "";
        }
        if(original.startsWith("honey"))
        {
            return Skipstring(original.substring(5));
        }
        else {
            return original.charAt(0)+Skipstring(original.substring(1));
        }
    }
}
