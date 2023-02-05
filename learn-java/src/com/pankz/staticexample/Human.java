package com.pankz.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long  population; //those properties that are not related to objects but common to all objects of same class
    //we declare those as static
    //Here population is common to both objects tanmay & ankit no need to pass it ine constructor's args

    public Human(int age,String name, int salary,boolean married) {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
//        this.population+=1;// In order to access the static variables we use class name AS below
        Human.population+=1; //modifying access variables
    }
}
//Though the o/p will remian same when using this.population+=1
//but static variable doesnot  go with the instance variable they are apart from it
//Convention is to put the class name while modifying  static variable
