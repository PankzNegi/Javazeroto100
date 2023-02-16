package com.pankz.OOPS;

import com.pankz.Access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj=new Subclass(12,"Negi");
        //Accessing protected members in different packages
        int n=obj.num;
    }
}
  class SubSubclass extends Subclass{      //Subclass of itself
    public SubSubclass(int num, String name) {
        super(num, name);
    }

      public static void main(String[] args) {
          SubSubclass obj=new SubSubclass(12,"Negi");
          //Accessing protected members in different packages
          int n=obj.num;

      }
}
//As child knows about parent,but parent doesn't.
