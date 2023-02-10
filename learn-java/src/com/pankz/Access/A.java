package com.pankz.Access;

public class A {
   protected int num;
    String name;
    int[]arr;

    public int getNum() {         //Getters get the value
        return num;
    }

    public void setNum(int num) {       //Setters set the values
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
//Default public allow access within same package,doesn't allow access in different package