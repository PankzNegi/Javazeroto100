package com.pankz.OOPS.Interfaces;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
     // Car car=new Car();
       // Engine car=new Car(); type of variable as type of interface
        //What we can access depends on type "Engine"
        //Which one of those we can access depends on "Car";
        //car.start();
        //car.acc();
       // car.stop();
       // System.out.println(car.PRICE);
       // System.out.println(car.a);
       // car.PRICE=78; as by default it is decalred as final in interfaces
       // Media media=new Car();
       // media.stop();  //problem occurs here therfore we create separate classes for these interfaces
        Nicecar car= new Nicecar();
        car.start();
        car.startmusic();
        car.upgradeEngine();// engine upgraded
        car.start(); //new engine started

    }
}
