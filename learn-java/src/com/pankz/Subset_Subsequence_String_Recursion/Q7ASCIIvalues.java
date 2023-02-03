package com.pankz.Subset_Subsequence_String_Recursion;

public class Q7ASCIIvalues {
    public static void main(String[] args) {
        String original="abc";
        ASCIIsubsequences("",original);

    }
    static void ASCIIsubsequences(String subset,String original)
    {
        if(original.isEmpty())
        {
            System.out.println(subset);
            return;
        }
        char ch=original.charAt(0);
        ASCIIsubsequences(subset+ch,original.substring(1));
        ASCIIsubsequences(subset,original.substring(1));
        ASCIIsubsequences(subset+(ch+0),original.substring(1));
    }
}
//We can put all these subsets on an array list as previous