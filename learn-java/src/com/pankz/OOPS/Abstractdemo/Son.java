package com.pankz.OOPS.Abstractdemo;

public class Son extends Parent {  //child class performing implementation
  //  public class Son extends Parent,Parent2 abstract class doesnot perform multiple inheritence
    //here parent &parent2 both are abstract classes.



    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();   //can overide normal methods as below
    }

    @Override
    void carrer() {
        System.out.println("I want to become developer");                   //overiding to use parent class methods or to change parent's body

    } //same functions with different body as that of Daughter class

    @Override
    void partner() {
        System.out.println("I love cricket");

    }
}
