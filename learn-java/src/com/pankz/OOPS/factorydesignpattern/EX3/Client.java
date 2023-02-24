package com.pankz.OOPS.factorydesignpattern.EX3;

public class Client {
    public static void main(String[] args) {
        ComputerFactory csf=new ComputerFactory();
        Computer laptop= csf.getComputer(ComputerType.valueOf("LAPTOP"),"4GB","1TB","2.4gHZ",true,false);
        System.out.println(laptop);
    }
}
