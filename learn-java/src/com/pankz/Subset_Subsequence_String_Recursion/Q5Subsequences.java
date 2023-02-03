package com.pankz.Subset_Subsequence_String_Recursion;
//Here we are taking variable inside the arguments,hence not returning just printing
public class Q5Subsequences {
    public static void main(String[] args) {
        String original="abc";
        subsequences("",original);



    }
    static void subsequences(String subset,String original)
    {
        if(original.isEmpty())
        {
            System.out.println(subset);
            return;
        }
        char ch= original.charAt(0);
        subsequences(subset+ch,original.substring(1));
        subsequences(subset,original.substring(1));
    }

}
// we can solve it by not adding it into the arguments of function
//Ans instead of printing we can add all subsets in an array list.
//Return type must be an array list
//Two choices either pass outside or pass it in the arguments of function
//other choice is pass in the body