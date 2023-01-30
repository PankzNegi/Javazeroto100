package com.pankz.Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String fullname="Pankaj Negi";
        System.out.println(Arrays.toString(fullname.toCharArray()));
        System.out.println((fullname.toLowerCase())); //creating new objects for lowercase
        System.out.println(fullname);//original one will not change,here is the proof
        System.out.println(fullname.indexOf('n'));
        String name= "           Pankz negi      "; //remove extra spaces
        System.out.println(name.strip());
        System.out.println(Arrays.toString(fullname.split(" ")));
    }
}
