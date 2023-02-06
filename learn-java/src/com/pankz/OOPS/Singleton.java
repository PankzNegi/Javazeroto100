package com.pankz.OOPS;

public class Singleton {
    private int num =10;

   private Singleton() {
        this.num = num;
    }
    private static Singleton instances;
    public static Singleton getInstances()
    {
        if(instances==null)
        {
            instances=new Singleton(); //this will be stored in instances
        }
        return instances;
    }
}
//therfore if we put private behind the constructor then we can't create its objects so can't access
//Private constructor can be accesed within same class
// therfore we make one function (as we can't in main)which creates its instance