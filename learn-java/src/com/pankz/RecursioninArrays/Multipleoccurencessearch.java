package com.pankz.RecursioninArrays;

import javax.sound.sampled.Line;
import java.util.ArrayList;

//What if array consist of similar item?? //linear search continued...
// Then best way is to put these similar items in Array list
public class Multipleoccurencessearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 4, 5, 6,7};
        Linearsearch(array, 6, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void Linearsearch(int[] arr, int target, int i) {


        if (i == arr.length)  //when crossing the boundation i.e base condition
        {
            return;
        }
        if (arr[i] == target)
        {
            list.add(i);    //Whenever we find an item just add it in list
        }

            Linearsearch(arr, target, i + 1);

    }
}

//Code is exactly same as linear search using recursion and returning its index
//Just adding Array list in this to store similar items indexes