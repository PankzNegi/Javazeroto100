package com.pankz.Revision;

public class Boxprice extends Boxweight{
    double cost;

    public Boxprice() {
       super();
       this.cost=-2;
    }
    Boxprice(Boxprice other)
    {
        super(other);
        this.cost=other.cost;
    }

    public Boxprice(double l, double b, double h, double weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }
}
