package com.pankz.OOPS;

public class Main {
    public static void main(String[] args) {
       // Singleton obj=new Singleton(); // errror as constructor is private
   //can't access private, therfore make the constaructor private so that no one can access them
        // obj.num
        Singleton obj=Singleton.getInstances();
        Singleton obj2=Singleton.getInstances();//accessing by class name  therfore static
        //all two refernce variable pointing to only one object
    }

}
