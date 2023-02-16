package com.pankz.OOPS.Interfaces;
//custom class for interface car
public class Car implements Engine,Brakes,Media //implementing interfaces
{

int a=34;
    @Override
    public void brake() {
        System.out.println("Brake of a normal car");
    }

    @Override
    public void start() {
        System.out.println("start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("stops like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("accelerate like a normal car");

    }
}
//Problem occur therefore we create separate classes for  each interfaces