package com.pankz.search;

import java.util.Arrays;
//ROW-COLS WISE SORTED ARRAY
public class matrixsearch {
    public static void main(String[] args) {
        int [][] array={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int[]answer=matrixsearch(array,28);
        System.out.println("Target element is at "+Arrays.toString(answer));
    }
    static int[] matrixsearch(int [] []matrix,int target)
    {
        int rows=0;
        int cols=matrix.length-1;
        while(rows<matrix.length && cols>=0)
        {
            if(matrix[rows][cols]==target)
            {
                return new int[]{rows,cols};
        }
            if(matrix[rows][cols]<target)
            {
                rows++;
            }
            else {
                cols--;
            }
    }
        return new int[] {-1,-1};
}}
