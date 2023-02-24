package com.pankz.OOPS.factorydesignpattern.EX2;

public class Car extends  Vehicle{
    int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}
