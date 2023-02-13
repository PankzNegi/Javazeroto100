package com.pankz.OOPS.Cloning.Shallow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCloning obj=new ShallowCloning(112,"negi");
        ShallowCloning obj2=(ShallowCloning)obj.clone();
        System.out.println(Arrays.toString(obj.arr));
        obj2.arr[0]=1200;  //Shallow copy
        System.out.println(Arrays.toString(obj.arr));
    }
}
