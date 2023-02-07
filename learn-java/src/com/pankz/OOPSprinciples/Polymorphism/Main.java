package com.pankz.OOPSprinciples.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shape=new Shapes();
//        Circle circle =new Circle();
//        Square square=new Square();
//        shape.area();
//        circle.area();
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        circle.area();
        //circle is of type Shapes therfore it can access which are in shape
        //Is area their,yes but o/p is of circle because it depends on objects of base class i.e Circle
        //Circle class overriding above one
        //Which one is able to accessed is defined by the objects i.e new Circle();
        //area() must be present in Shape class,if not error
        // }

    }
}