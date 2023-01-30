package com.pankz.Patterns;
//PATTERN WITH SPACES
public class Q6 {
    public static void main(String[] args) {
        pattern(6);

    }
    static void pattern(int n)
    {

        for(int i=1;i<=2*n-1;i++)
        {
            int totalcols=i<=n?i:2*n-i;    //as it is increasing decreasing therfore separate variable
           // for finding spaces
            int totalspaces=n-totalcols;//find relation for no. of spaces from the given pattern
            for(int spaces=0;spaces<totalspaces;spaces++)
            {
                System.out.print(" ");
            }


            for(int j=1;j<=totalcols;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
