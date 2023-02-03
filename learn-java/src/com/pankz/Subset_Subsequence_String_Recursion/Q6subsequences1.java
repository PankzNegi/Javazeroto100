package com.pankz.Subset_Subsequence_String_Recursion;

import java.util.ArrayList;

//Same as that of Q5 but instead of printing we are returning all subsets in an "array list"
//We can either solve it by passing an array list within an arguments or outside
//other choice is make array list in the main body by not passing it in arguments
//Within "body"->
public class Q6subsequences1 {
    public static void main(String[] args) {
        String original="abcd";
        System.out.println(subsequences("","pqrs"));


    }
    static ArrayList<String> subsequences(String subset,String original) //local var in the arguments method1
    {
        if(original.isEmpty())
        {
            ArrayList<String> list =new ArrayList<String>();
            list.add(subset);
            return list;
        }
        char ch=original.charAt(0);
        ArrayList<String> left= subsequences(subset+ch,original.substring(1));
        ArrayList<String> right=subsequences(subset,original.substring(1));
        left.addAll(right);
        return left;
    }
}
