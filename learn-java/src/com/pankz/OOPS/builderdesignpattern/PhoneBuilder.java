package com.pankz.OOPS.builderdesignpattern;

public class PhoneBuilder {
    String os;
    private int ram;
    String processor;
    double screenSize;
    int battery;

    public PhoneBuilder(String os) {

        this.os = os;


    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this; // Every setters returning the object of PhoneBuilder
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;  //returning object
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }


    public Phone build()
    {
        return new Phone(this);
    }


}
