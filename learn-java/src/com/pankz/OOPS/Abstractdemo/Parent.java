package com.pankz.OOPS.Abstractdemo;

public abstract class Parent {
    int age;     //can declare local variables in the abstract class
    final int VAL;   //can declare final variable  inside abstarct class.
    static int value=67; //can declare static variable also inside abstract class

    public Parent(int age) {  //constructor of abstract class but we can't call it via objects,use it via super()
        this.age = age;
        VAL=78976;
    }
    //Can we create static methods inside abstract class??    Yes
    static void message()    //can call it via class name not by objects therefore no worry
    {
        System.out.println("hello there");
    }
    void normal()
    {
        System.out.println("abstract class contain normal methods");
    }

    abstract  void carrer();
    abstract void partner();

}
