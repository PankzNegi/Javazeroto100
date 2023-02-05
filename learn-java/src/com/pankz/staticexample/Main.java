package com.pankz.staticexample;

public class Main {
    public static void main(String[] args) {
        Human tanmay=new Human(25,"tanmay pant",100000,false);
        Human ankit=new Human(25,"ankit solanki",70000,true);
        Human mohit=new Human(12,"mohit bisht",5000,false);
        System.out.println(tanmay.name);
        System.out.println(tanmay.population); //accessing static variables
        System.out.println(ankit.population);
        System.out.println(mohit.population);
       // greetings(); you have to make it static below
    }
     static void greetings() //like this
    {
        System.out.println("within static you cant use something unstatic");
    }

}
//No need of import within same folder/package
// STATIC VARIABLES= When a member is declared static,
// It can be accessed before any of the objects of the class is being created
//Without referencing to refernced variable i.e class convention.
//comment out all the objects above(tanmay,ankit,mohit) still,we can access
//Static variable does not depends on objects!!