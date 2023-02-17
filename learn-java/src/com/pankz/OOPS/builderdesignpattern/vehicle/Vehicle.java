package com.pankz.OOPS.builderdesignpattern.vehicle;

public class Vehicle {
    private String engine;
    private int wheel;
    //optional parameter is airbag
    private int airbag;
    //Getters
    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbag() {
        return airbag;
    }//Private Constructor
    private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbag = builder.airbag;
    }

    public static class VehicleBuilder{
        private String engine;
        private int wheel;
        private int airbag;

        public VehicleBuilder(String engine,int wheel) {
            this.engine = engine;
            this.wheel=wheel;
        }

        public VehicleBuilder setAirbag(int airbag) {
            this.airbag = airbag;
            return this;

        }
        public  Vehicle build()
        {
            return new Vehicle(this);
        }
    }
}
