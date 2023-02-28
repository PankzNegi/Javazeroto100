package com.pankz.mapandhashmap;

import java.util.HashMap;

//Map-Map is a set of key value pair(lookup table)
//Map of employee name to their id number
public class Maps {
    public static void main(String[] args) {

//<> inside this no primitive data types,use only wrapper classes.
    HashMap<String,Integer> empId =new HashMap<>(); //Key String,Value Integer
        //Map is called an interface,map interface specifies what kind of methods a real map implementation h've to support
    //There can be different types of implementations of map interface, and here hashmap is one of that implementation.
        empId.put("Pankaj",4567);
        empId.put("Nitesh",8978);
        empId.put("Jay",3456);
        System.out.println(empId);
        //Getting individuals empid
        empId.get("Jay");
        System.out.println("employee id of jay is "+empId.get("Jay"));
        //Check to see if certain key exist or not
        System.out.println(empId.containsKey("Nitesh"));
        //Check to see if map conatin certain value or not
        System.out.println(empId.containsValue(8978));
        //Overriding current values
        empId.put("Nitesh",2389);//update value if already exist
        System.out.println(empId);
        //replacing values
        empId.replace("Pankaj",9124);
        System.out.println(empId);
        //put -->if key doesn't exist it will go ahead and add to map
        //replace-->it won't do anything if key doesn't exist
        empId.putIfAbsent("Lalit",5630); //put if key value is absent
        System.out.println(empId);
        //Remove key value from map
        empId.remove("Lalit");
        System.out.println(empId);
        //Giving all the keys
        System.out.println(empId.keySet());
        //Printing all the values from map
        for(String key: empId.keySet())
        {
            System.out.println(key+":"+empId.get(key));
        }


}}