package com.pankz.RecursioninArrays;

public class Pattern2 {
    public static void main(String[] args) {


    triangle(4,0);

}
    static void triangle(int row,int cols) {
        if (row == 0) {
            return;
        }
        if (cols < row) {

            triangle(row, cols + 1);
            System.out.print("*"); //this line execute when above function reaches base condition/finishes execution
        } else {

            triangle(row - 1, 0);
            System.out.println();  //this line executes when previous function finishes its execution

        }

    }}