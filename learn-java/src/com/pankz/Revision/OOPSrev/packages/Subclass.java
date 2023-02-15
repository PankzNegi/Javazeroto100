package com.pankz.Revision.OOPSrev.packages;

public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj2 =new Subclass(34,"pankaj");
        System.out.println(obj2.num);

    }

}
