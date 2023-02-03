package com.pankz.Subset_Subsequence_String_Recursion;
//From the given string remove all 'a's from it
public class Q1BasicString {
    public static void main(String[] args) {
        String modified="";
        String original="nadcaafa";
        Skipcharacter(modified,original);

    }
    static void Skipcharacter(String modified,String original) //Extra variable inside the arguments i.e modified
    {
        if(original.isEmpty())
        {
            System.out.println(modified);
            return;
        }
        char ch=original.charAt(0);
        if(ch=='a')
        {
            Skipcharacter(modified,original.substring(1));  //Using local variablke in rec call also
        }//Coz we have passed it in the arguments of function
        else {
            Skipcharacter(modified+ch,original.substring(1));
        }

    }

}
//We can solve this by taking the extra variable inside the body
//Instead of passing it in function and recursive call