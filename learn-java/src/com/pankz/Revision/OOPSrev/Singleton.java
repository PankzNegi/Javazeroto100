package com.pankz.Revision.OOPSrev;

public class Singleton {
    private Singleton() {

    }
    private static Singleton instances;
    public static Singleton getinstances()
    {
        if(instances==null)
        {
            instances=new Singleton();
        }
        return instances;
    }
}
