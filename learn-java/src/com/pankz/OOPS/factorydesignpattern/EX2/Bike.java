package com.pankz.OOPS.factorydesignpattern.EX2;

public class Bike extends  Vehicle{
    int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}
