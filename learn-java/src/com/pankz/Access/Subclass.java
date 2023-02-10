package com.pankz.Access;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(12,"Negi");
        //Accessing protected members in subclass of class A
        int n=obj.num;
        System.out.println(obj instanceof A); //instanceof operatot
    }
}
//With protected in different packages,only able to access it in subclass.

