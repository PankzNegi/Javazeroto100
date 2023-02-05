package com.pankz.staticexample;

public class Aboutstatics2 {
    //Initialisation of static variables
    static int a=9;
    static int b;
    static {              //static block will run only one time
        System.out.println("you are in static block");
        b=a*2;

    }


    public static void main(String[] args) {
        Aboutstatics2 obj=new Aboutstatics2();
        System.out.println(obj.a+" " +obj.b);
        Aboutstatics2.b+=2;
        System.out.println(Aboutstatics2.a+ " " +Aboutstatics2.b);
        Aboutstatics2 obj2=new Aboutstatics2();
        System.out.println(Aboutstatics2.a+" "+Aboutstatics2.b);
    }
}
