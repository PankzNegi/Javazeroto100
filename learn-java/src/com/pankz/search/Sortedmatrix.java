package com.pankz.search;

import java.util.Arrays;

public class Sortedmatrix {
    public static void main(String[] args) {

        int[][]array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString (sortedmatrixsearch(array,6)));
    }

    //simple binary search in rows between cols provided
    static int[] binarysearch(int [] []matrix,int row,int cstart,int cend,int target)
    {
        while(cstart<=cend)
        {
           int mid=cstart+(cend-cstart)/2;
           if(matrix[row][mid]==target)
           {
               return new int[] {row,mid};
           }
           if(matrix[row][mid]<target)
           {
               cstart=mid+1;
           }else {
               cend=mid-1;
           }
        } return new int[]{-1,-1};
    }
    static int[] sortedmatrixsearch(int[] []matrix,int target)
    {
        //checking if matrix conatin only 1 row
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1) //if we have only one element left
        {
           return binarysearch(matrix,0,0,cols-1,target);
        }


        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        //run loop till two rows are remaining
        while(rstart<(rend-2))   //binary search in middle column
        {
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target)
            {
                return new int[]{mid,cmid};

            }
            if(matrix[mid][cmid]<target)
            {
                rstart=mid;
            }
            else {
                rend=mid;
            }
        } //now for two rows ,check if middlie cols contain target
        if(matrix[rstart][cmid]==target) {
            return new int[]{rstart, cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //now search in 1st to 4th half if target is not in middle cols


            if(target<=matrix[rstart][cmid-1])
            {
             return binarysearch(matrix,rstart,0,cmid-1,target);
            }
        if(target>=matrix[rstart][cmid+1] && target<=matrix[rstart][cols-1])
        {
            return binarysearch(matrix,rstart,cmid+1,cols-1,target);
        }
        if(target<=matrix[rstart+1][cmid-1])
        {
            return binarysearch(matrix,rstart+1,0,cmid-1,target);
    }
        else {

            return binarysearch(matrix, rstart + 1, cmid+1, cols - 1, target);
        }

}}
