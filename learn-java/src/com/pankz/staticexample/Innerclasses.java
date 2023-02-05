package com.pankz.staticexample;

public class Innerclasses { //this cant be static
    static class A //this can be static as depends on above class
    {
        String name;

        public A(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        A obj=new A("pankaj"); //ERROR UNTILL YOU MAKE a AS STATIC
        A obj2 =new A("KRISH"); // as A depends on above class and this class do not have any obj/instances

    }
}