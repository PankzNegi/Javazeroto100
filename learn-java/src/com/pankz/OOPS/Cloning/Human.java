package com.pankz.OOPS.Cloning;

public class Human implements Cloneable {

    int age;
    String name;

    public Human(int age,String name)
    {
        this.age=age;
        this.name=name;

    }



    //    public Human(Human other) {
//        this.age=other.age;
//        this.name=other.name;
//    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




//Object cloning means making exact copy of an object via clone method in object class
//There is an interface "Clonable" in java.lang we must implement that by the class whose clone we want to make
//If we will not implement Clonable thben it will throw exception CloneNotSupportedException