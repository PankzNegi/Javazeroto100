package com.pankz.Revision;

public class Boxweight extends  Box{
    double weight;

    public Boxweight() {
        this.weight = -1;

    }
    public Boxweight(Boxweight other)
    {
        super(other);
        weight=other.weight;
    }

    public Boxweight(double l, double b, double h, double weight) {
       super(l, b, h);
        this.weight = weight;
    }
}
