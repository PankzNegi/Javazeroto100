package com.pankz.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println("j"+"s"); //Concatenate of strings
        System.out.println('h'+'t'); //adding ascii values
        System.out.println((char)('a'+3));  //Type casting
        System.out.println("g"+3); //concatente here also
        System.out.println("p"+'e'); //if any1 data type is string o/p is string
        System.out.println("Pankaj"+ new Integer(68)); //calls /return toString() of int
        System.out.println("Pankaj"+new ArrayList<>()); //return toString() of array list
       // System.out.println(new Integer(68)+new ArrayList<>()); this will not work works only on primitives data types or complex with atleat one of these object of type string
        System.out.println(new Integer(68)+ "" +new ArrayList<>()); //atleast one string,returns string 68 empty string empty array
    }
}
//Strings can't be converted in to ASCII values.
// g3 is the o/p coz of the above reason and 3 coz of INTEGER wrapper class that will call toString()