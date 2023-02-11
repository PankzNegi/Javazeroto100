package com.pankz.OOPS.Interfaces.Extending;

public interface A {
   // static interface method must have body as they can't be inherited or overriden
    static void greeting()
    {
        System.out.println("static method");
    }
    void fun();
}
