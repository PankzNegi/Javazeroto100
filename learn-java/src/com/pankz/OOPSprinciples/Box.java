package com.pankz.OOPSprinciples;

public class Box {
    double l;
    double h;
    double w;
    Box()
    {
        this.h=-1;
        this.l=-1;
        this.w=-1;

    }
    //cube
    Box(double side)   //constructor with arguments
    {
        this.w=side;
        this.l=side;
        this.h=side;
    }
    //constructor with three arguments


     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    //copy constructor
    Box(Box other)
    {
        this.h=other.h;
        this.l=other.l;
        this.w=other.w;
    }
    public void info()
    {
        System.out.println("inhertience");
    }
}
