package com.pankz.Permutation_Combination;

public class Q1 {
    public static void main(String[] args) {
        permutation("","pqr");

    }
    static void permutation(String subset,String original)
    {
        if(original.isEmpty())
        {
            System.out.println(subset);
            return;
        }
        char ch=original.charAt(0);
        for(int i=0;i<=subset.length();i++)
        {
            String firsthalf=subset.substring(0,i);
            String secondhalf=subset.substring(i,subset.length());
            permutation(firsthalf+ch+secondhalf,original.substring(1));
        }
    }

}

