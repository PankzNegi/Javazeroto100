package com.pankz.Patterns;

public class Q5 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n)
    {
        for(int i=0;i<2*n;i++)
        {
            int totalcols=i>n?2*n-i:i;
            for(int j=0;j<totalcols;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

