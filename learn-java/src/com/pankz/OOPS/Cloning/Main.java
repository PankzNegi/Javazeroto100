package com.pankz.OOPS.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human pankaj=new Human(26,"pankaj");
      //  Human twin =new Human(pankaj); Not an effiecient way of making clone with new keyword
        Human twin =(Human) pankaj.clone();   //cloning an object of class Human(Human)
        System.out.println(twin.name + " " +twin.age);

    }
}
//Object cloning means making exact copy of an object via clone method in object class
//There is an interface "Clonable" in java.lang we must implement that by the class whose clone we want to make
//we h've  to mention "CloneNotSupportedException" in the defination of function (here in psvm)
//that something is inside this function that throws this exception