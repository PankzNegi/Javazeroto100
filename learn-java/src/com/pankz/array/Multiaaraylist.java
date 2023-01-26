package com.pankz.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiaaraylist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());// "dimension wala part" initialisation part as we did in 1d or 2d araay as by default every index is null
        }// above code is same as this one initialising int[][]arr=new int[][]
        //adding elements
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);

    }
}

