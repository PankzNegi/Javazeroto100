package com.pankz.OOPS.Abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son =new Son(12);
        son.carrer();
        Daughter daughter=new Daughter(24);
        //Parent daughter =new Daughter(24); //Run time polymorphism we can access via classname
        daughter.carrer();
       // Parent mom=new Parent();
        //Therfore ae cant create object of abstract class
        // coz if we access abstract class via its object,we cant access anything as its body is empty.
        //Similarly we cant create abstract constructor(same reason as above)
        // we can call static methods of abstract class via class name
        Parent.message(); //accessing static methods
        son.normal();//accessing normal methods

    }
}
