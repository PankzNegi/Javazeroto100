package com.pankz.Strings;

public class StringPerformance {
    public static void main(String[] args) {
        String alphabets=""; //for o/p to be string one data type must be string fot CONCAT
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);   //casting in to char from ascii values
            alphabets=alphabets+ch;
          //  System.out.println(ch);

        }
        System.out.println(alphabets);
    }
}
//M/m wastage-here each time new string objects are created .Therfore another data types comes in to play here...