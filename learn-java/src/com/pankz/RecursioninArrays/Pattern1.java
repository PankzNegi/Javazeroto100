package com.pankz.RecursioninArrays;

public class Pattern1 {
    public static void main(String[] args) {
        triangle(4,0);

    }
    static void triangle(int row,int cols)
    {
        if(row==0)
        {
            return;
        }
        if(cols<row) {
            System.out.print("*");
            triangle(row, cols + 1);
        }
            else{
            System.out.println();
            triangle(row-1,0);

        }
    }

}
