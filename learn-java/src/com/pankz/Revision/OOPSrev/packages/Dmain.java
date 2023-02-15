package com.pankz.Revision.OOPSrev.packages;

public class Dmain {
    public static void main(String[] args) {
        D obj=new D(5);
        for (int i=0;i<1000000;i++)
        {
            obj=new D(6);
        }
    }
}
