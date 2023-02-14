package com.pankz.Revision.OOPSrev;

public class Staticblock {
    static int a=4;
    static int b;
    static
    {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
//        Staticblock obj =new Staticblock();
        System.out.println(Staticblock.a + " " +Staticblock.b);
        Staticblock.b+=3;
        System.out.println(Staticblock.a + " " +Staticblock.b);

        Staticblock obj2=new Staticblock();
        System.out.println(Staticblock.a + " " +Staticblock.b);
    }
}
