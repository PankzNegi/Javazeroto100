package com.pankz.Revision.OOPSrev.packages;

public class A {
   public int num;
   public String name;
    int[]arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[8];
    }
}
