package com.pankz.search;

public class Searchingq5 {
    public static void main(String[] args) {
        int [][]list={{12,34,-67},{3456,67,-897},{45678,980,3456}};
        int ans=maximum(list);
        System.out.println(ans);

    }

    static int maximum(int[][] array) {
        int max = array[0][0];
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(array[i][j]>max)
                {
                    max=array[i][j];

                }
            }
        } return max;

    }
}