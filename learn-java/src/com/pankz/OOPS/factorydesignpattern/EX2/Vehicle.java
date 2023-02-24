package com.pankz.OOPS.factorydesignpattern.EX2;

public abstract class Vehicle {
    public abstract int getWheel();

    @Override
    public String toString() {
        return "Wheel"+ this.getWheel();
    }
}
