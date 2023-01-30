package com.pankz.Strings;

public class Stringbuilders {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            builder.append(ch);  //no new string objects are created here

        }
        //builder.reverse();
        System.out.println(builder);


    }
}
