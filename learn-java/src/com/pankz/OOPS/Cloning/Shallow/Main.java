package com.pankz.OOPS.Cloning.Shallow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human obj=new Human(112,"negi");
        Human obj2=(Human)obj.clone();
        System.out.println(Arrays.toString(obj.arr));
        obj2.arr[0]=1200;  //Shallow copy
        System.out.println(Arrays.toString(obj.arr));
    }
}
//For primitives it is making a new one (int)
//But for non primitives or objects its is POINTING to that (String,array)
//In non primitive case any changes made to it reflected to its copy
//Shallow copying is not a pure copying