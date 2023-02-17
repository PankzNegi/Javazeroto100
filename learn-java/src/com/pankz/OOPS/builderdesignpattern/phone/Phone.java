package com.pankz.OOPS.builderdesignpattern.phone;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;


    public String getOs() {
        return this.os;
    }

    public int getRam() {
        return this.ram;
    }

    public String getProcessor() {
        return this.processor;
    }

    public double getScreenSize() {
        return this.screenSize;
    }

    public int getBattery() {
        return this.battery;
    }

    public Phone(PhoneBuilder builder) {

        this.os = builder.os;
        this.ram = ram;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.battery = builder.battery;
    }
    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
