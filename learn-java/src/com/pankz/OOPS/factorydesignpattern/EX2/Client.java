package com.pankz.OOPS.factorydesignpattern.EX2;

public class Client {
    public static void main(String[] args) {


        VehicleFactory vsf = new VehicleFactory();
        Vehicle car = vsf.getInstance("car", 4); //give me the instance of vehicle car
        System.out.println(car);
        Vehicle bike=vsf.getInstance("bike",2);//give me the instances of vehicle bike
        System.out.println(bike);


    }
}
