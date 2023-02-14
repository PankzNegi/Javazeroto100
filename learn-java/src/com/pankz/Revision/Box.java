package com.pankz.Revision;

public class Box {
    double l;
    double b;
    double h;

    public Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    Box(double side) //side
    {
        this.l=side;
        this.b=side;
        this.h=side;
    }

    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Box(Box other)
    {
        this.l=other.l;
        this.b=other.b;
        this.h=other.h;
    }
    public void info()
    {
        System.out.println("running box");
    }
}
