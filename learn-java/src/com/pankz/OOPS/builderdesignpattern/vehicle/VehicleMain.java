package com.pankz.OOPS.builderdesignpattern.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car=new Vehicle.VehicleBuilder("200cc",4)
                .setAirbag(4).build();
       Vehicle bike=new Vehicle.VehicleBuilder("150cc",2).build();
        System.out.println(car.getEngine());
        System.out.println(car.getAirbag());
        System.out.println(car.getWheel());

        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbag());
    }
}
