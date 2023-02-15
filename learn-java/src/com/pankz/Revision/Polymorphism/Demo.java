package com.pankz.Revision.Polymorphism;

import java.util.Arrays;

public class Demo {
    int num;

    public Demo(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Demo demo=new Demo(7);
        System.out.println(demo);

    }
}