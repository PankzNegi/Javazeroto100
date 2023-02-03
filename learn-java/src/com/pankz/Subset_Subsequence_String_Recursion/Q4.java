package com.pankz.Subset_Subsequence_String_Recursion;
//Skip a string if it is not the required string
//Remove "hon" only if the string is not "honey"
public class Q4 {
    public static void main(String[] args) {
        String original="dsthongtaympl";
       String ans= Skiphonnothoney(original);
        System.out.println(ans);

    }
    static String Skiphonnothoney(String original)
    {
        if(original.isEmpty())
        {
            return "";
        }
        if(original.startsWith("hon")&& !original.startsWith("honey"))
        {
           return  Skiphonnothoney(original.substring(3));
        }
        else {
            return original.charAt(0)+Skiphonnothoney(original.substring(1));
        }

    }
}
