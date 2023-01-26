package com.pankz.search;

import java.util.Arrays;

public class Searchq4 {
    public static void main(String[] args) {
        int [][]list={{2,5,8},{56,67,98},{-8,-456,270}};
            int target=67;
            int [] ans=Search2d(list,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search2d(int[][]array,int target)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(array[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }  return new int[]{-1,-1};

    }
}
