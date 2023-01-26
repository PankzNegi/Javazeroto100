package com.pankz.search;

public class Searchq1 {
    public static void main(String[] args) {
        String string="pankaj";
        char ch='b';
        boolean  ans=Search(string,ch);
        System.out.println(ans);
    }
    static  boolean Search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)

        {
        if(target==str.charAt(i))
        {
            return true;
        }

        }
        return false;
    }
}
