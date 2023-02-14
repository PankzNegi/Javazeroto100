package com.pankz.Revision;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj=new A(12,56.7f);
        A obj2=(A)obj.clone();
        System.out.println(obj.age);
        System.out.println(obj2.age);
        obj2.age=67;
        System.out.println(obj.age);
        obj2.arr[0]=250;
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(obj2.arr));
    }
}
