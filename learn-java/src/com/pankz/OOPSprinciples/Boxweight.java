package com.pankz.OOPSprinciples;

public class Boxweight extends Box{
    double weight;

    public Boxweight() {
        this.weight=-1;
    }
    Boxweight(double side,double weight)
    {
        super(side);
        this.weight=weight;
    }
    Boxweight(Boxweight other)
    {
        super(other);
        weight=other.weight;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w); //call the parents call constructor from where you will get l.w.h
        this.weight = weight;
    }
}
