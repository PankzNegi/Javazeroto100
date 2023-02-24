package com.pankz.OOPS.factorydesignpattern.EX4;

public class Client {
    public static void main(String[] args) {
        PolygonFactory psf=new PolygonFactory();
        Polygon square=psf.getPolygon(4);
        System.out.println(square.getType());
    }
}
