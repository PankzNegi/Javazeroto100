package com.pankz.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>(4);
//        list.add(1);
//        list.add(2);
//
//        list.add(1);
//        list.add(2);
//        list.add(9);
//        list.add(1);
//        list.add(6);
//        list.add(89);
//        list.set(0,234);
        for(int i=0;i<10;i++)
        {
            list.add(input.nextInt());


        }
//        for(int i=0;i<10;i++) {
//            System.out.println(list.get(i));
//        }
      //  System.out.println(list.contains(89));
        System.out.println(list);

    }
}
