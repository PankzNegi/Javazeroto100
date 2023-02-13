package com.pankz.OOPS.Cloning.DeepCopying;

import com.pankz.OOPS.Cloning.DeepCopying.Human;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human obj = new Human(112, "negi");
        Human obj2 = (Human) obj.clone();
        System.out.println(Arrays.toString(obj.arr));
        obj2.arr[0] = 1200;
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(obj2.arr)); //Now only obj2 will change
    }
}
