package com.pankz.OOPS.Abstractdemo;

public class Daughter extends Parent {       //child class performing implementation


    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I want to become doctor");        //overiding to use parent class methods or to change parent's body

    }

    @Override
    void partner() {
        System.out.println("I love biology");

    }
}
