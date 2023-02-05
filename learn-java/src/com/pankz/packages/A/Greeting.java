package com.pankz.packages.A;  //path of this file from the /src

import static com.pankz.packages.Greeting.message; //How is java running the file from another packages?
//meaning is that package name "package" has class Greeting with message function import that
public class Greeting {
    public static void main(String[] args) {
        System.out.println("hello");
        message();   //importing from other package
    }
}
//pacakages are folders that allow to contain multiple java classes with same name
//here we have one class named as greeting,but we cant make class of same name with it
//But we can do so in other package